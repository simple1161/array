package ru.simple.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class 6.2 Тест для класса который переварачивает массив
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.turn(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.turn(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}

