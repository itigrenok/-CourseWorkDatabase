package ru.stankin.bd.factory;

import java.util.HashMap;
import java.util.Map;

public final class KfbFactory {

    /**
     * Map<Double, Boolean> - boolean > 350?
     */
    private static final Map<Map<Double, Boolean>, Double> KFB_MAP_SYMMETRICAL = new HashMap<>();
    private static final Map<Map<Double, Boolean>, Double> KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE = new HashMap<>();
    private static final Map<Map<Double, Boolean>, Double> KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE = new HashMap<>();
    private static final Map<Map<Double, Boolean>, Double> KFB_MAP_CONSOLE = new HashMap<>();

    static {
        double k = 0.2;
        double i = 1;

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.0);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.0);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.03);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.01);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.05);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.02);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.08);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.05);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.15);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.08);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.18);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.10);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.25);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i++, false), 1.13);

        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, true), 1.30);
        KFB_MAP_SYMMETRICAL.put(Map.of(k * i, false), 1.16);


        i = 1;
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.02);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.01);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.07);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.04);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.13);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.07);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.20);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.11);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.27);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.15);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.37);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.20);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.50);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i++, false), 1.25);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, true), 1.60);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.put(Map.of(k * i, false), 1.32);

        i = 1;
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.1);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.05);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.20);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.12);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.30);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.17);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.44);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.23);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.57);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.32);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.72);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.40);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, true), 1.85);
        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i++, false), 1.50);

        KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.put(Map.of(k * i, false), 1.60);

        i = 1;
        KFB_MAP_CONSOLE.put(Map.of(k * i, true), 1.25);
        KFB_MAP_CONSOLE.put(Map.of(k * i++, false), 1.13);

        KFB_MAP_CONSOLE.put(Map.of(k * i, true), 1.55);
        KFB_MAP_CONSOLE.put(Map.of(k * i++, false), 1.28);

        KFB_MAP_CONSOLE.put(Map.of(k * i, true), 1.90);
        KFB_MAP_CONSOLE.put(Map.of(k * i++, false), 1.50);

        KFB_MAP_CONSOLE.put(Map.of(k * i, true), 2.30);
        KFB_MAP_CONSOLE.put(Map.of(k * i, false), 1.70);
    }

    public static Double getSymmetricalKfb(double fdb, double hb) {
        return KFB_MAP_SYMMETRICAL.get(Map.of(fdb, hb < 350));
    }

    public static Double getNonSymmetricalKfbTrue(double fdb, double hb) {
        return KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_TRUE.get(Map.of(fdb, hb < 350));
    }

    public static Double getNonSymmetricalKfbFalse(double fdb, double hb) {
        return KFB_MAP_NON_SYMMETRICAL_AND_SHAFT_RIGID_FALSE.get(Map.of(fdb, hb < 350));
    }

    public static Double getConsoleKfb(double fdb, double hb) {
        return KFB_MAP_CONSOLE.get(Map.of(fdb, hb < 350));
    }
}