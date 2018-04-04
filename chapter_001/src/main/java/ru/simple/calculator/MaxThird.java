package ru.simple.calculator;

/**
 * Class Расчет максимального числа из трех
 * @author Semenov
 * @since 5.04.2018
 * @version 1.0
 */

public class MaxThird {

    /**
     *
     * @param first первое значение
     * @param second второе значение
     * @param third третье значение
     * @return Максимальное значение.
     */
    public int max(int first, int second, int third){
        return Math.max(first, Math.max(second, third));
    }
}
