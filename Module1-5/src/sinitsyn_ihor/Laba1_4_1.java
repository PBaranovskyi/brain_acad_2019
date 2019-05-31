package sinitsyn_ihor;

import java.util.Random;
public class Laba1_4_1 {

    public static void main(String[] args) {
        int b = (int)(Math.random()*255 - 128);
        int s = (int)(Math.random()*65_535 - 32_768);
        long i = (long)(Math.random()*4_294_967_295L - 2_147_483_648L);
        long l = (long)(Math.random()*18_446_744_073_709_551_614D - 9_223_372_036_854_775_808D);
        double f = (float)(Math.random()*6.8E38 - 3.4E38);
        double d = (Math.random()*1.7E308 - 1.1E308);
        Random randGen = new Random();
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = abc.charAt(randGen.nextInt(abc.length()));
        double t = (Math.random()*2);
        boolean ft;
        if (t == 1) {
            ft = true;
        }
        else {
            ft = false;
        }
/*
        RandomTestClass randGen = new RandomTestClass();
        int minB = -128;
        int maxB = 127;
        int diffB = maxB - minB;
        int b = randGen.nextInt(diffB+1);
        b +=minB;

        int minS = -32768;
        int maxS = 32767;
        int diffS = maxB - minB;
        int s = randGen.nextInt(diffS+1);
        s += minS;

        int minI = -2147483648;
        int maxI = 2147483647;
        int diffI = maxI - minI;
        int i = randGen.nextInt(diffI+1);
        i += minI;

        long minL = -9223372036854775808L;
        long maxL = 9223372036854775807L;
        long diffL = maxL - minL;
        long L = randGen.nextLong(diffL+1);
        L += minL;
*/
        System.out.println("Случайное число типа byte = "+b);
        System.out.println("Случайное число типа short = "+s);
        System.out.println("Случайное число типа int = "+i);
        System.out.println("Случайное число типа long = "+l);
        System.out.println("Случайное число типа float = "+f);
        System.out.println("Случайное число типа double = "+d);
        System.out.println("Случайное значение типа char = "+c);
        System.out.println("Случайное значение типа boolean = "+ft);
    }

}
