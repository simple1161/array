package ru.simple.loop;

public class Factorial {
    /**
     * Метод принимающий положительное целое число n
     * @param value положительное целое число n
     * @return возвращает факториал
     */
    public int calc(int value) {
        int result = 1;
        for (int i = 0; i <= value; i++) {
            if(i > 0) {
                result = result * i;
            }

        }
        return result;
     }
}
