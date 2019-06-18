package mykhailo_kaloshyn.mainacad.lab2_2.myA;

import static com.mainacad.lab2_2.myA.A.calcSquare;

public class objectsA {

    static void someMethodWithFinalInteger(int a) {
        System.out.println();
        System.out.print("Square of final int " + a + " is: ");
        a = a * a;
        System.out.println(a);
    }

    public static void main(String[] args) {

        calcSquare(3);
        calcSquare(5, 4);
        calcSquare(5, 5);

        final int p = 3;
        someMethodWithFinalInteger(p);
    }
}
