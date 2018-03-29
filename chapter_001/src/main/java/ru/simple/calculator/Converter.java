package ru.simple.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * приватная переменная курса евро.
     */
    private int courseEuro = 70;

    /**
     * приватная переменная курса евро.
     */
    private int courseDollar = 60;

    /**
     * приватная переменная конвертации евро в рубль.
     */
    private int convertEuroToRub;

    /**
     * приватная переменная конвертации рубля в евро.
     */
    private int convertRubToEuro;

    /**
     * приватная переменная конвертации рубля в доллар.
     */
    private int convertRubToDollar;

    /**
     * приватная переменная конвертации евро в рубль.
     */
    private int convertDollarToRub;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        this.convertRubToEuro = value / this.courseEuro;
        return this.convertRubToEuro;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public double euroToRub(int value) {
        this.convertEuroToRub = value * this.courseEuro;
        return this.convertEuroToRub;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public double rubleToDollar(int value) {
        this.convertRubToDollar = value / this.courseDollar;
        return this.convertRubToDollar;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public double dollarToRub(int value) {
        this.convertDollarToRub = value * this.courseDollar;
        return this.convertDollarToRub;
    }


}
