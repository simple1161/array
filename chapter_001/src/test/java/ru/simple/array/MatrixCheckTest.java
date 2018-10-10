package ru.simple.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class 6.6 Тест для класса, который проверяет все ли диагонали массива заполнены одинаковыми элементами.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class MatrixCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, true},
                {false, true, false},
                {false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
