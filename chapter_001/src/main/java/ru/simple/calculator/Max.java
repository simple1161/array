package ru.simple.calculator;

/**
 * Class Вычисление максимального числа
 * @author semenov
 * @since 2.04.2018
 * @version 1.0
 */

public class Max {

    /**
     * приватная максимального числа.
     */
    private int max;

    /**
     * @param first первое число
     * @param second второе число
     * @return возвращает максимальное число
     */
    public int maxValue(int first, int second){
        return max = first > second ? first : second;
    }

}
