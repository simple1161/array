package ru.simple.calculator;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenTwoValue() {
        Max max = new Max();
        assertThat(max.maxValue(4, 6), is(6));
    }

    @Test
    public void whenInputFirstSecondThirdValueReturnMaxValue() {
        Max max = new Max();
        int result = max.max(1, 2, 6);
        int expected = 6;
        MatcherAssert.assertThat(result, is(expected));
    }
}
