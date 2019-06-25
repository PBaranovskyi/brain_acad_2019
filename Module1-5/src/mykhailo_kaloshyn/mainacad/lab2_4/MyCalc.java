package mykhailo_kaloshyn.mainacad.lab2_4;

public class MyCalc {

    public static double calcPi(int n) {
        double pi=0;
        int counter = 1;

        for (int i = 1; i <= n; i++) {
if (i%2==1) {
    pi += 4d/counter;
} else {
    pi -= 4d/counter;
}
counter+=2;
        }
        return pi;
    }
}
