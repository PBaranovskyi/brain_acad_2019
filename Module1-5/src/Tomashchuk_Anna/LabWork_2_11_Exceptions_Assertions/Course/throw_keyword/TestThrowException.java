package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.throw_keyword;

public class TestThrowException {
    public static void main(String[] args) {
        // Симмулирование ошибки
        // throw - Позволяет исскуственно запустить Exception
        // Например - неправильный пароль или e-mail
        throw new RuntimeException("Test");
        // Exception in thread "main" java.lang.RuntimeException: Test
        // 	at Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.throw_keyword.TestThrowException.main(TestThrowException.java:5)
    }
}
