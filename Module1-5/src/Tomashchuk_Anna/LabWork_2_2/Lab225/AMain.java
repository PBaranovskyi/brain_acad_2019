package Tomashchuk_Anna.LabWork_2_2.Lab225;

public class AMain {
    public static void main(String[] args) {
        A a = new A();

        int resI; // rectangle int
        double resD; // rectangle double

        int resI_f; // Foursquare int
        double resD_f; // Foursquare double

        final double pi = 3.14; // Значение Пи=3.14, константа
        double resI_c; // circle int
        double resD_c; // circle double

        final int f = 7;


        resI = a.calcSquareRectangle(3, 5);
        System.out.println("Result Square of rectangle int: " + resI);
        System.out.println();

        resD = a.calcSquareRectangle(3.5, 2.5);
        System.out.println("Result Square of rectangle double: " + resD);
        System.out.println();

        resI_f = a.calcSquareFoursquare(5);
        System.out.println("Result Square of foursquare int: " + resI_f);
        System.out.println();

        resD_f = a.calcSquareFoursquare(4.5);
        System.out.println("Result Square of foursquare double: " + resD_f);
        System.out.println();

        resI_c = a.calcSquareCircle(2, pi);
        System.out.println("Result Square of circle int: " + resI_c);
        System.out.println();

        resD_c = a.calcSquareCircle(2.75, pi);
        System.out.println("Result Square of circle double: " + resD_c);
        System.out.println();

        System.out.println("Result of Final: " + a.calcFinal(f));

    }
}
