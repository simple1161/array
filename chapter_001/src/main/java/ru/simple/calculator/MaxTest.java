package ru.simple.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenTwoValue(){
        Max max = new Max();
        assertThat(max.maxValue(4, 6), is(6));
    }
}
