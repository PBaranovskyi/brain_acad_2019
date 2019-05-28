package mykhailo_kaloshyn.mainacad.lab1_4;

public class Lab1_4_3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean newOr = a | b;
        boolean newAnd = a & b;
        boolean newXOR = a ^ b;
        boolean newNot1 = !a;
        boolean newNot2 = !b;
        System.out.println("boolean a = " + a);
        System.out.println("boolean b = " + b);
        System.out.println(" a OR b: a|b = " + newOr);
        System.out.println(" a AND b: a&b = " + newAnd);
        System.out.println(" a XOR b: a^b = " + newXOR);
        System.out.println(" NOT a: !a = " + newNot1);
        System.out.println(" NOT b: !b = " + newNot2);
    }
}
