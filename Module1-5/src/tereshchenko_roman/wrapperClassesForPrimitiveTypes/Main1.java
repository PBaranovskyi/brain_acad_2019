package tereshchenko_roman.wrapperClassesForPrimitiveTypes;

public class Main1 {
    public static void main(String[] args) {
        Integer x1 = 129;
        Integer x2 = new Integer(129);
        Integer x3 = new Integer("129");
        Integer x4 = Integer.valueOf(129);
        Integer x5 = Integer.parseInt("129");

        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println(x1 == x5);
        System.out.println(x2 == x3);
        System.out.println(x2 == x4);
        System.out.println(x2 == x5);
        System.out.println(x3 == x4);
        System.out.println(x3 == x5);
        System.out.println(x4 == x5);

        System.out.println();

        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));
        System.out.println(x2.equals(x3));
        System.out.println(x2.equals(x4));
        System.out.println(x2.equals(x5));
        System.out.println(x3.equals(x4));
        System.out.println(x3.equals(x5));
        System.out.println(x4.equals(x5));
        }

    }

