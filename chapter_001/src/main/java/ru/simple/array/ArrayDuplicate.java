package ru.simple.array;

import java.util.Arrays;

/**
 * Class 6.7 Класс удаляет дубликаты в массиве.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class ArrayDuplicate {

    /**
     * Проверяет все ли диагонали массива заполнены одинаковыми элементами.
     * @param array) массив целых чисел.
     * @return возвращает массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int value = array.length;
        for (int i = 0; i < value; i++) {
            for (int j = i + 1; j < value; j++) {
                if (array[i].equals(array[j])) {
                    value--;
                    array[j] = array[value];
                    array[value] = array[i];
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, value);
    }
}
