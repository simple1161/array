package ru.simple.calculator;

/**
 * Class Расчета площади треугольника
 * @author semenov
 * @since 4.04.2018
 * @version 1.0
 */

public class Triangle {

    /**
     * первый отрезок треугольника.
     */
    private double a;

    /**
     * Второй отрезок треугольника.
     */
    private double b;

    /**
     * Третий отрезок треугольника.
     */
    private double c;

    /**
     * Полупериметр треугольника.
     */
    private double perimeter = 0;

    /**
     * Площадь треугольника.
     */
    private double area = 0;

    /**
     * Булево значение существования треугольника.
     */
    private boolean triangleExist = true;

    /**
     *
     * @param a первый отрезок
     * @param b второй отрезок
     * @param c третий отрезок
     */
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @param a первый отрезок
     * @param b второй отрезок
     * @param c третий отрезок
     * @return Полупериметр треугольника
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     *
     * @param a первый отрезок
     * @param b второй отрезок
     * @param c третий отрезок
     * @return Площадь треугольника
     */
    public double calcHeron(double a, double b, double c){
        if((this.a < this.b + this.c) && (this.b < this.a + this.c) && (this.c < this.a + this.b)){
            this.area = Math.sqrt(this.perimeter * ((this.perimeter - this.a) * (this.perimeter - this.b) * (this.perimeter - this.c)));
        }else {
            this.triangleExist = false;
        }
        return this.area;
    }

    /**
     * @return Площадь треугольника
     */
    public double area() {
        this.perimeter = period(this.a, this.b, this.c);
        return calcHeron(this.a, this.b, this.c);
    }

    /**
     *
     * @return Возвращает true если треугольник существует.
     */
    public boolean existTriangle(){
        return triangleExist;
    }

}
