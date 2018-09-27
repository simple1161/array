package ru.simple.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array){

        int value = array.length;
        for (int i = 0; i < value; i++){
            for (int j = i + 1; j < value; j++){
                if(array[i].equals(array[j])){
                    value--;
                    array[j] = array[value];
                    array[value] = array[i];

                }
            }
            int b = 5;



        }
        return Arrays.copyOf(array, value);
    }
}
