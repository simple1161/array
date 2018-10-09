package ru.simple.array;

/**
 * Class 6.1 Класс переберает массив
 * @author semenov
 * @since 08.10.2018
 * @version 2.0
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = data[index];
                break;
            }
        }
        return rst;
    }
}
