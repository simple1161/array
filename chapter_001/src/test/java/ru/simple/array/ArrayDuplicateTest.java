package ru.simple.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String [] inputArray = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String [] expectArray = new String[] {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String [] resultArray = arrayDuplicate.remove(inputArray);
        assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}
