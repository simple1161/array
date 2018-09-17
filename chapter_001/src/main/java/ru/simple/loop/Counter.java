package ru.simple.loop;

/**
 * Class 5.1. Подсчет суммы чётных чисел в диапазоне
 * @author semenov
 * @since 17.09.2018
 * @version 1.0
 */
public class Counter {

    /**
     * Метод принимающий диапозон чисел
     * @param start первое положительное число
     * @param finish второе положительное число
     * @return Возвращает сумму четных чисел
     */

    public int add(int start, int finish) {

        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
