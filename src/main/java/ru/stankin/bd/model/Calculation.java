package ru.stankin.bd.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Calculation {

    /**
     * Межосевое расстояние
     */
    private Double aw;

    /**
     * Ширина венца колес
     */
    private Double bw;

    /**
     * Передаточное число
     */
    private Double u;

    /**
     * Угл наклона линии зуба по длительному цилиндру
     */
    private Double b;

    /**
     * Модуль m
     */
    private Double m;

    /**
     * Число зубьев шестерни
     */
    private Double z1;

    /**
     * Число зубьев колеса
     */
    private Double z2;

    /**
     * Относительная ширина колеса
     */
    private Double fdb;

    /**
     * Твердость рабочих пов зубьев
     */
    private Double hb;

    /**
     * Расположение шестерни относительн опоры
     */
    private GearLocationType gearLocationType;

    /**
     * Вал является весьма жестким?
     */
    private Boolean isShaftRigid;

    /**
     * Коэф смещения
     */
    private Double x;

    /**
     * Эквивалнтное число зубьев
     */
    private Double zv;

    /**
     * Коэффициент учитывающий форму зубьев для зкбчатых колес внешнего зацепления
     */
    private Double yf;

    /**
     * Тип зуба
     */
    private ToothType toothType;

    /**
     * Допускаемое напряжение
     */
    private Double afp;
}