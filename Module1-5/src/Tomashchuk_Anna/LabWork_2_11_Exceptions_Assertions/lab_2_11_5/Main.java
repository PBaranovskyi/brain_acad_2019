package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_5;

public class Main {
    public static void main(String[] args) {
        Byte bb = 10;
        int ii = 15;

        long result = compute(bb, ii);

        // version 1
//        assert 25 == result;
        // version 2
        assert 25 == result : "The sum is not correct!";

        System.out.println("Correctly, result = " + result);
    }

    public static Long compute(Byte valueByte, Integer valueInt) {
        long result = valueByte + valueInt;
        // variant correct
//        return new Long(result);
        // variant not correct
        return 0L;
    }
}
