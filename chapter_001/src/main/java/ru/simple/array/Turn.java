package ru.simple.array;

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = array.length - i - 1;
            int value = index - i;
            int val1 = array[i];
            array[i] = array[index];
            array[index] = val1;
            if (value <= 2)
                break;
        }
        return array;
    }
}
