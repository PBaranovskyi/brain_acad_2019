package com.brainacad.controlFlowStatements.Arrays;

import java.util.Arrays;

public class LabWork_1_6_1 {
    public static void main(String[] args) {
        int[] EvenThirty = new int[15];
        for (int i = 0; i < EvenThirty.length; i++)
            EvenThirty [i] = (i+1) * 2;
        System.out.println(Arrays.toString(EvenThirty));
    }
}
