package ru.simple.calculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxThirdTest {
    @Test
    public void whenInputFirstSecondThirdValueReturnMaxValue(){
        MaxThird maxThird = new MaxThird();
        int result = maxThird.max(1, 2, 6);
        int expected = 6;
        assertThat(result, is(expected));
    }
}
