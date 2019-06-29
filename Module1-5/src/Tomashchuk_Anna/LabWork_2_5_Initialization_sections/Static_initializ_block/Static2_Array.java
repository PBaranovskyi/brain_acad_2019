package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Static_initializ_block;

import java.util.Arrays;

public class Static2_Array {
    private static char[] alph;

    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(alph));
    }
}
