package ru.simple.array;

/**
 * Class 6.4 Класс проверяет, что слово начинается в определенной последовательности.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
                break;
            }
        }
        // проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}
