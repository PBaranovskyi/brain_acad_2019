package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_5;

public class MyCalc {
    public static int n;
    public static double PI = 4;

// У меня неправтльно - считает только целые числа, дробные не считает
    public static double calcPi(int n) {
        if (n == 1) {
            PI = (4.0 - 4.0/3.0   ); // PI =( 4 - 4/3 );
        } else if (n == 2) {
            PI = (4 - 1 + 2); //PI = (4 - 4/3 + 4/5);
        } else if (n == 3) {
            PI = (4 - 1 + 2 + 3); //PI = (4 - 4 / 3 + 4 / 5 - 4 / 7);
        } else if (n == 4) {
            PI = (4 - 1 + 2 + 3 - 1); // PI = (4 - 4 / 3 + 4 / 5 - 4 / 7 + 4 / 9);
        } else if (n == 5) {
            PI = (4 - 1 + 2 + 3 - 1 + 5); // PI = (4 - 4 / 3 + 4 / 5 - 4 / 7 + 4 / 9 - 4 / 11);
        }
        return PI;
    }

}
