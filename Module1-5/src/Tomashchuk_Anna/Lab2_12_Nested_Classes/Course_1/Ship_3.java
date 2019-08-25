package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship_3 {
    // Внктренние классы имеют доступ к полям внешних классов
    public int x = 10;

    public static class Boat {
        // нельзя использовать в статическом методе нестатическую переменную
        public void test() {
            // как получить доступ к нестатическому x -
            //надо создать объект New ship
            Ship sh=new Ship();
            sh.x=20;
        }
    }
}
