package com.brainacad.controlFlowStatements.Arrays;

import java.util.Arrays;

public class LabWork_1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int mMax = m[0];
        for (int i = 1; i < m.length; i++)
            if (m[i] > mMax)
                mMax = m[i];
        int mMin = m[0];
        for (int i = 1; i < m.length; i++)
            if (m[i] < mMin)
                mMin = m[i];
            int mAvg = (mMax + mMin)/2;
        System.out.println("Maximum value from the array is " + mMax);
        System.out.println("Maximum value from the array is " + mMin);
        System.out.println("Average value from the array is " + mAvg);
    }

}

