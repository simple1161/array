package ru.simple.calculator;


/**
 * Class расчета идеального веса
 * @author semenov
 * @since 9.09.2018
 * @version 1.0
 */

public class Fit {

    /**
     * константа веса для мужщины.
     */
    private final int CONSTMAN = 100;

    /**
     * константа веса для женшины.
     */
    private final int CONSTWOMAN = 110;

    /**
     * общая константа.
     */
    private final double CONSTWEIGTH = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - this.CONSTMAN) * this.CONSTWEIGTH;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - this.CONSTWOMAN) * this.CONSTWEIGTH;

    }
}
