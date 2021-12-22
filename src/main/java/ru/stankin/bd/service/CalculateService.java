package ru.stankin.bd.service;

import ru.stankin.bd.model.Calculation;
import ru.stankin.bd.model.CalculationResponse;

public interface CalculateService {

    CalculationResponse calculation(Calculation calculation);
}