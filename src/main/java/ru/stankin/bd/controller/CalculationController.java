package ru.stankin.bd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.stankin.bd.model.Calculation;
import ru.stankin.bd.model.CalculationResponse;
import ru.stankin.bd.service.CalculateService;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/calculation")
public class CalculationController {

    private final CalculateService calculateService;

    @PostMapping
    public @ResponseBody CalculationResponse calculation(@RequestBody Calculation calculation) {
        return calculateService.calculation(calculation);
    }
}