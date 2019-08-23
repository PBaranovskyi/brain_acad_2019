package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.throws_keyword;

public class TestThrowException_2 {

    public static void testExcp() {
        try {
            int x = 10 / 0;
        } catch (Exception ex) {
            System.out.println("catch");
            return;
        } finally { //finally - тут пишем код в любом случае, не важно произошел Exception или нет
            // finally игнорирует return
            System.out.println("finally");
        }

    }

    public static void main(String[] args) {
        try{
            testExcp();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

/*        public static void testExcp() throws Exception{
            throw new Exception("test");
        }*/

    }
}
