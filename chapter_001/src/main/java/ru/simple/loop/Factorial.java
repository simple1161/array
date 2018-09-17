package ru.simple.loop;
/**
 * Class 5.2. Класс считает фрактал
 * @author semenov
 * @since 17.09.2018
 * @version 1.0
 */
public class Factorial {
    /**
     * Метод принимающий положительное целое число n
     * @param value положительное целое число n
     * @return возвращает факториал
     */
    public int calc(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
     }
}
