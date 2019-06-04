import java.util.Arrays;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] EvenMassiv = new int[15];
        for (int j = 0; j < EvenMassiv.length; j++)
            EvenMassiv[j] = (j + 1) * 2;
        System.out.println(Arrays.toString(EvenMassiv));

    }
}