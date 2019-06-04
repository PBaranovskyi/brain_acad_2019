package com.brainacad.arrays;

import java.util.Arrays;

public class LabWork_1_6_6 {
    public static void main(String[] args) {
        int[] avTemp = {-10, -5, 1, 10, 20, 25, 27, 24, 15, 10, -2, -8};
        int[] avTempNeg = new int[12];
        int[] avTempPos = new int[12];

        for (int n = 0; n < avTemp.length; n++)
            if (avTemp[n] < 0)
                avTempNeg[n] = avTemp[n];
            else avTempPos[n] = avTemp[n];

        Arrays.sort(avTempNeg);
        Arrays.sort(avTempPos);

        for (int val : avTempNeg) {
            if (val != 0){
                System.out.print(val + " ");
            }
        }
        ;

        System.out.println();

        for (int val : avTempPos) {
            if (val != 0){
                System.out.print(val + " ");
            }
        }
        ;
    }
}
