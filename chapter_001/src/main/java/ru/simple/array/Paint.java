package ru.simple.array;

import java.util.function.BiPredicate;

/**
 * Class 6.8 Класс рисует пирамиду
 * @author semenov
 * @since 17.10.2018
 * @version 1.0
 */
public class Paint {
    /**
     * Рисует правую часть пирамиды
     * @param height высота пирамиды
     * @return возвращает правую часть пирамиды.
     */
    public String rightTrl(int height) {
            return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    /**
     * Рисует левую часть пирамиды
     * @param height высота пирамиды
     * @return возвращает левую часть пирамиды.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
    /**
     * Рисует пирамиду
     * @param height высота пирамиды
     * @return возвращает пирамиду.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}

