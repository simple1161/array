package ru.simple.calculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea(){
        Triangle triangle = new Triangle(2, 2,2);
        double result = triangle.area();
        double expected = 1D;
        assertThat(result, closeTo(expected, 0.8));
    }

}
