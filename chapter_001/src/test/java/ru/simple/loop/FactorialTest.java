package ru.simple.loop;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 120;
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        MatcherAssert.assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        MatcherAssert.assertThat(result, is(expected));
    }
}
