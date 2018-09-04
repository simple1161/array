package ru.simple.calculator;

/**
 * Class Расчета площади треугольника
 * @author semenov
 * @since 3.09.2018
 * @version 1.0
 */

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    /** Конструктор принимает координаты трех точек
     @param a Координаты первой точки
     @param b Координаты второй точки
     @param c Координаты третей точки
     */
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return вовращает значение перетра.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод вычислет площадь треугольника.
     *
     * @return Возвращает площадь треугольника, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if(exist(ab, ac, bc)){
            rsl = Math.sqrt(p * ((p - ab) * (p - ac) * (p - bc)));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return метод возвращает true если треугольнмк существует
     */
    public boolean exist(double ab, double ac, double bc) {
        boolean exists;
        if((ab < ac + bc) && (ac < ab + bc) && (bc < ab + ac))
            exists = true;
        else
            exists = false;
        return  exists;
    }


}
