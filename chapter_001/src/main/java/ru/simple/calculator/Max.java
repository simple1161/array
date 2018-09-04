package ru.simple.calculator;

/**
 * Class Вычисление максимального числа
 * @author semenov
 * @since 4.09.2018
 * @version 1.0
 */

public class Max {

    /**
     * приватная максимального числа.
     */
    private int max;

    /**
     * Метод вычислет максимальное число мз двух.
     * @param first первое число
     * @param second второе число
     * @return Возвращает максимальное число
     */
    public int maxValue(int first, int second){
        return max = first > second ? first : second;
    }

    /**
     * Метод вычисляет максимальное число из трех
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return Возвращает максимальное число.
     */
    public int max(int first, int second, int third){
        return Math.max(first, Math.max(second, third));
    }

}
