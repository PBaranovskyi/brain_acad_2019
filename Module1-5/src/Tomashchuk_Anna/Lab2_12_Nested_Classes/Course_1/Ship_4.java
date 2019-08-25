package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship_4 {
    // Внктренние классы имеют доступ к полям внешних классов
    public static int x = 10;

    public static class Boat {
        // нельзя использовать в статическом методе нестатическую переменную
        // Здесь объект создавать необязательно потому что static
        public void test() {
            x = 20;
        }
    }
}
