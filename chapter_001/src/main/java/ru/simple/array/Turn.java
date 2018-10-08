package ru.simple.array;

/**
 * Class 6.2 Класс Переварачивает массив
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = array.length - i - 1;
            int save = array[i];
            array[i] = array[index];
            array[index] = save;
            if ((array.length / index)  == 2)
                break;
        }
        return array;
    }
}
