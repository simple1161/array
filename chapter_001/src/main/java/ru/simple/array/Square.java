package ru.simple.array;
/**
 * Class 6.0 от 1 до n возведенными в квадрат
 * @author semenov
 * @since 18.09.2018
 * @version 1.0
 */
public class Square {
    /**
     * Метод принимающий положительное целое число n
     * @param bound положительное целое число, ширина
     * @return возвращает заполненый массив от 1 до n возведенными в квадрат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int value = 1;
        for (int i = 0; i < bound; i++) {
            rst[i] = value * value;
            value = value + 1;
        }
        return rst;
    }
}
