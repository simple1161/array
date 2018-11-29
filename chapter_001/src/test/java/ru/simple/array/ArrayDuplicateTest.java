package ru.simple.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class 6.8 Тест для класса, который удаляет дубликаты в массиве.
 * @author semenov
 * @since 08.10.2018
 * @version 1.0
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] inputArray = new String[] {"Привет", "Мир", "Мир", "Супер", "Мир"};
        String[] expectArray = new String[] {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] resultArray = arrayDuplicate.remove(inputArray);
        assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }

    @Test
    public void whenRemoveDuplicatesThenArrayAllElementsDublicat() {
        String[] inputArray = new String[]{"Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] expectArray = new String[] {"Привет"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] resultArray = arrayDuplicate.remove(inputArray);
        assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}
