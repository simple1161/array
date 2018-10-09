package ru.simple.array;

/**
 * Class 6.6 Класс создает таблицу умножения.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class Matrix {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param size размер таблицы.
     * @return отсортированный массив.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i < size + 1; i++){
            for (int j = 1; j < size + 1; j++){
                table[i - 1][j - 1] = j * i;
            }
        }
        return table;
    }
}