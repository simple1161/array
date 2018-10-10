package ru.simple.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class 6.1 Тест для класса который переберает массив
 * @author semenov
 * @since 08.10.2018
 * @version 2.0
 */

public class FindLoopTest {

    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasElementNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
