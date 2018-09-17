package ru.simple.loop;
/**
 * Class 5.3 Класс строит шахматную доску в псевдографике
 * @author semenov
 * @since 17.09.2018
 * @version 1.0
 */
public class Board {
    /**
     * Метод принимающий положительное целое число n
     * @param width положительное целое число, ширина
     * @param height положительное целое число, высота
     * @return возвращает факториал
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int y = 0; y < width; y++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((y + i) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
