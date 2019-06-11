package tereshchenko_roman.arrays.arrays_Add_Home_Works;

import java.util.Arrays;

public class Add_Home_Work_21 {
    public static void main(String[] args) {

        int[][] mArr = new int[5][5];

        int n = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                mArr[i][j] = n;
                n++;
                System.out.print(mArr [i][j] + " ");}
            System.out.println();
                    }


    }

}
