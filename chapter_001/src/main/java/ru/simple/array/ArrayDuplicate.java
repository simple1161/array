package ru.simple.array;

import java.util.Arrays;

/**
 * Class 6.8 Класс удаляет дубликаты в массиве.
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
    public String[] remove(String[] array){
        boolean check = false;
        int i = 0;
        for (; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i].equals(array[j])){
                    array[j] = array[array.length - 1];
                    check = true;
                    break;
                }

            }
            if(check){
                check = false;
                i--;
                array = Arrays.copyOf(array, array.length - 1);
            }
        }
        return array;
    }
}
