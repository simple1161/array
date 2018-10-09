package ru.simple.array;

/**
 * Class 6.2 Класс Переварачивает массив
 * @author semenov
 * @since 08.10.2018
 * @version 2.0
 */

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int save = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = save;
        }
        return array;
    }
}
