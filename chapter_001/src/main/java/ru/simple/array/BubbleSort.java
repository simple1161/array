package ru.simple.array;

/**
 * Class 6.5 Класс сортирует методом пузырька.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class BubbleSort {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param array массив чисел.
     * @return отсортированный массив.
     */
    public int[ ] sort(int[ ] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if ((array[ j - 1 ] > array[j])) {
                    int save = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = save;
                    j++;
                }
            }
        }
        return array;
    }
}
