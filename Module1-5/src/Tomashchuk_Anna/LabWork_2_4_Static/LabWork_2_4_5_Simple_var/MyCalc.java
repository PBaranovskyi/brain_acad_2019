package Tomashchuk_Anna.LabWork_2_4_Static.LabWork_2_4_5_Simple_var;

public class MyCalc {
    public static int n;
    public static double PI = 4;

// У меня неправbльно - считает только целые числа, дробные не считает - Решили !
    // Чтобы считало дробные числа их нужно указывать с точкой 4.0- например
    //Результат математической опреции -integer. В делениии всегда должен участвовать double
    public static double calcPi(int n) {
        if (n == 1) {
            // PI =( 4 - 4/3 ); - так будет считать неправильно
            // 4 - 4/3  - приводит к integer, поэтому результат integer
            PI = (4.0 - 4.0/3.0  );
        } else if (n == 2) {
            PI = (4.0 - 4.0/3.0 + 4.0/5.0);
        } else if (n == 3) {
            PI = (4.0 - 4.0 / 3.0 + 4.0 / 5.0 - 4.0 / 7.0);
        } else if (n == 4) {
            PI = (4.0 - 4.0 / 3.0 + 4.0 / 5.0 - 4.0 / 7.0 + 4.0 / 9.0);
        } else if (n == 5) {
            PI = (4.0 - 4.0 / 3.0 + 4.0 / 5.0 - 4.0 / 7.0 + 4.0 / 9.0 - 4.0 / 11.0);
        }
        return PI;
    }

}
