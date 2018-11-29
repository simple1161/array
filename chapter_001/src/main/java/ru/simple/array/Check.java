package ru.simple.array;

/**
 * Class 6.3 Класс проверяет, что все элементы в массиве являются true или false.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
