package ru.simple.calculator;

/**
 * Class Расчета площади треугольника
 * @author semenov
 * @since 4.04.2018
 * @version 1.0
 */

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;

    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
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

    private boolean exist(double ab, double ac, double bc) {
        boolean exists = false;
        if((ab < ac + bc) && (ac < ab + bc) && (bc < ab + ac)){
            exists = true;
        }else {
            exists = false;
        }
        return  exists;
    }


}
