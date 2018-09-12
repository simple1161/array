package ru.simple.loop;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import ru.simple.calculator.Max;

import static org.hamcrest.core.Is.is;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        MatcherAssert.assertThat(result, is(expected));
    }
}
