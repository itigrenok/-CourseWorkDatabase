package ru.stankin.bd.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stankin.bd.entity.BroadcastEntity;
import ru.stankin.bd.entity.DetailEntity;
import ru.stankin.bd.factory.KfbFactory;
import ru.stankin.bd.model.Calculation;
import ru.stankin.bd.model.CalculationResponse;
import ru.stankin.bd.model.ToothType;
import ru.stankin.bd.repository.BroadcastRepository;
import ru.stankin.bd.repository.DetailRepository;
import ru.stankin.bd.service.CalculateService;

import java.util.UUID;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CalculateServiceImpl implements CalculateService {

    private final BroadcastRepository broadcastRepository;
    private final DetailRepository detailRepository;

    @Override
    public CalculationResponse calculation(Calculation calculation) {

        double eb = calculation.getBw() * Math.sin(calculation.getB()) / (Math.PI * calculation.getM());

        double KFa;
        double Ea = 0;
        double n = 5; // TODO: Необходимо уточнение
        if (eb > 1) {
            Ea = (1.88 - 3.2 * (1 / calculation.getZ1() + 1 / calculation.getZ2())) * Math.cos(calculation.getB());

            KFa = (4 + (Ea - 1) * (n - 5)) / (4 * Ea);
        } else {
            KFa = 1;
        }

        double Kfb = 0;
        switch (calculation.getGearLocationType()) {
            case SYMMETRICAL:
                Kfb = KfbFactory.getSymmetricalKfb(calculation.getFdb(), calculation.getHb());
                break;
            case NON_SYMMETRICAL:
                Kfb = calculation.getIsShaftRigid()
                        ? KfbFactory.getNonSymmetricalKfbTrue(calculation.getFdb(), calculation.getHb())
                        : KfbFactory.getNonSymmetricalKfbFalse(calculation.getFdb(), calculation.getHb());
                break;
            case CONSOLE:
                Kfb = KfbFactory.getConsoleKfb(calculation.getFdb(), calculation.getHb());
                break;
        }

        double qf = 0.011;
        double g0;
        if (calculation.getM() < 3.5) {
            g0 = 28;
        } else if (calculation.getM() > 3.5 && calculation.getM() < 10) {
            g0 = 31;
        } else {
            g0 = 37;
        }

        double v = 5; // TODO: Необходимо уточнение
        double wfv = qf * g0 * v * Math.pow(calculation.getAw() / calculation.getU(), 1 / 2.0);
        double kfv = 1 + wfv * calculation.getBw() / (Kfb * KFa); // TODO: Не учитываем Kt
        double wft = calculation.getBw() * KFa * Kfb * kfv; // TODO: Не учитываем Kt

        double YE = 1;
        double Yb;
        if (calculation.getToothType() == ToothType.RIGHT_TOOTH) {
            Yb = 1;
        } else {
            Yb = 1 - calculation.getB() / 140.0;
        }

        double af = calculation.getYf() * YE * Yb * wft / calculation.getM();
        boolean dost = af <= calculation.getAfp();

        save(calculation, kfv, Yb, KFa, Kfb, dost, g0, Ea, af, v, n, wft, eb, wfv);

        return CalculationResponse.builder()
                .result(af)
                .build();
    }

    private void save(Calculation calculation, double kfv, double Yb, double KFa, double Kfb, boolean dost, double g0, double Ea,
                      double af, double V, double n, double wft, double eb, double wfv) {
        BroadcastEntity broadcastEntity = BroadcastEntity.builder()
                .id(UUID.randomUUID().toString())
                .x(calculation.getX())
                .yf(calculation.getYf())
                .eb(eb)
                .kfv(kfv)
                .ye(1.0)
                .yb(Yb)
                .kfa(KFa)
                .kfb(Kfb)
                .dost(dost ? 1.0 : 0.0)
                .g0(g0)
                .ea(Ea)
                .build();
        broadcastEntity = broadcastRepository.save(broadcastEntity);

        DetailEntity detailEntity = DetailEntity.builder()
                .id(UUID.randomUUID().toString())
                .broadcastEntity(broadcastEntity)
                .aw(calculation.getAw())
                .bw(calculation.getBw())
                .u(calculation.getU())
                .b(calculation.getB())
                .afp(calculation.getAfp())
                .m(calculation.getM())
                .fbd(1.0)
                .wfv(wfv)
                .hb(calculation.getHb())
                .zv(calculation.getZv())
                .z1(calculation.getZ1())
                .z2(calculation.getZ2())
                .af(af)
                .v(V)
                .n(n)
                .wft(wft)
                .build();
        detailRepository.save(detailEntity);
    }
}