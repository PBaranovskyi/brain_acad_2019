package sinitsyn_ihor.LabWorks.LabWorks2_10;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = new Integer("10");
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");
        toPrint(x1, x2, x3, x4, x5);
        x1 = 150;
        x2 = new Integer(150);
        x3 = new Integer("150");
        x4 = Integer.valueOf(150);
        x5 = Integer.parseInt("150");
        toPrint(x1, x2, x3, x4, x5);
    }

    public static void toPrint(Integer x1, Integer x2, Integer x3, Integer x4, Integer x5) {
        System.out.println(" ");
        System.out.println("For x = " + x1);
        System.out.println("x1 == x2: " + (x1 == x2));
        System.out.println("x2 equals x3: " + x2.equals(x3));
        System.out.println("x3 == x4: " + (x3 == x4));
        System.out.println("x4 equals x5: " + x4.equals(x5));
    }
}
