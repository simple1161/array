package ru.simple.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * константа веса для мужщины.
     */
    private final int ConstMan = 100;

    /**
     * константа веса для женшины.
     */
    private final int ConstWoman = 110;

    /**
     * общая константа.
     */
    private final double constWeight = 1.15;

    /**
     * приватная переменная идеального веса мужщины.
     */
    private double weightMan;

    /**
     * приватная переменная идеального веса женшины.
     */
    private double weightWoman;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        this.weightMan = (height - this.ConstMan) * this.constWeight;
        return this.weightMan;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        this.weightWoman = (height - this.ConstWoman) * this.constWeight;
        return this.weightWoman;
    }
}
