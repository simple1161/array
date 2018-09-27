package ru.simple.array;

public class BubbleSort {
    public int[ ] sort(int[ ] array) {

        for (int i = 0; i < array.length; i++){
            int temp = 0;
            for (int j = 1; j < array.length; j++) {
                if((array[ j - 1 ] > array[j])) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
