package mainclasses.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Integer val = 500;
        val++;
        long longer = 300;

        long sum = val + longer;

//        byte val1 = val.byteValue();


        System.out.println(calc(val.byteValue()) + " CALC RESULT");


        Integer first = new Integer(50);
        Integer second = new Integer(50);

        System.out.println(first == second);

        int i = 10;
        int i2 = 0;
        int sum2;
        try {
            sum2 = i / i2;
        } catch (Exception e){
            System.out.println("Я поймал ошибку" + e.getMessage());
            sum2 = 0;
        }

        System.out.println(sum2);

    }

    static long calc(byte val) {
        int i = 10;
        int i2 = 0;
        int sum2 = 0;
        try {
            sum2 = i / i2;
        } catch (Exception e){
            return val * val * sum2;
        } finally {
            return val * val;
        }
    }
}
