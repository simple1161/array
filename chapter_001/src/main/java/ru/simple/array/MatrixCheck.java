package ru.simple.array;

/**
 * Class 6.6 Класс проверяет все ли диагонали массива заполнены одинаковыми элементами.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class MatrixCheck {

    /**
     * Проверяет все ли диагонали массива заполнены одинаковыми элементами.
     * @param data массив булевых значений.
     * @return возвращает булево истину, если диаганали равны.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int right = 0;
        int left = data.length - 1;
        for (int i = 1; i < data.length; i++) {
            right++;
            left--;
            if (data[0][0] != data [i][right] || data[0][data.length - 1] != data [i][left]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
