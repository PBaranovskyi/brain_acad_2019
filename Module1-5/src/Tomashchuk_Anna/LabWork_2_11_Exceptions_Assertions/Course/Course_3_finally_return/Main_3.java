package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.Course_3_finally_return;

public class Main_3 {
    public static int testExcp20(){
        int y=50;
        try{
            int x=10/0;
        }catch (Exception ex){
            System.out.println("catch");
            return y;
        }finally {
            System.out.println("finally");
            y=100; // не выыодит потому что нет return y
            //return y;
        }
        return 0; // не выполняется , потому что он не заходит в catch
    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(testExcp20());
        System.out.println("end");

    }
}
