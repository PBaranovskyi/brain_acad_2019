package sinitsyn_ihor.LabWorks.LabWorks2_10;

public class WrapperDemo2 {
    public static void main(String[] args) {
        Byte x = 13;
        Integer y = 666;
        System.out.println("Byte x = " + x + ", Integer y = " + y + ", your result (x+y) = " + compute(x, y));
    }

    public static Long compute(Byte x1, Integer x2) {
        Long x3 = Long.valueOf(x1) + Long.valueOf(x2);
        return x3;
    }
}
