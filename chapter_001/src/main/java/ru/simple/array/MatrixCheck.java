package ru.simple.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean rightDiagonal = true;
        boolean leftDiagonal = true;
        boolean result = true;
        int internal = 1;
        boolean check = data[0][0];
        for (int i = 1; i < data.length; i++) {
            if(check != data [i][internal]) {
                rightDiagonal = false;
                break;
            }
            internal = internal + 1;
        }
        check = data[0][data.length - 1];
        internal = data.length - 2;
        for (int j = 1; j < data.length; j++) {
            if(check != data [j][internal]) {
                leftDiagonal = false;
                break;
            }
            internal = internal - 1;
        }
        if((rightDiagonal == false) || (leftDiagonal == false)){
            result = false;
        }
        return result;
    }
}
