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
        for (int i = 1; i < bound + 1; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
