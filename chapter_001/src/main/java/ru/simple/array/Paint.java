package ru.simple.array;

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
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int column = 0; column != height; column++){
            for (int row = 0; row != weight; row++){
                if(column >= row){
                    screen.append("^");
                }else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Рисует левую часть пирамиды
     * @param height высота пирамиды
     * @return возвращает левую часть пирамиды.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int column = 0; column != height; column++){
            for (int row = 0; row != weight; row++){
                if( row >= weight - column - 1) {
                    screen.append("^");
                }else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Рисует пирамиду
     * @param height высота пирамиды
     * @return возвращает пирамиду.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height + height - 1;
        for (int column = 0; column != height; column++){
            for (int row = 0; row != weight; row++){
                if(row >= height - column - 1 && row <= height + column - 1){
                    screen.append("^");
                }else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }


}

