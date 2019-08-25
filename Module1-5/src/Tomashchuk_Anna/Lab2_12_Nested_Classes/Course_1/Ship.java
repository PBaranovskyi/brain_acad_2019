package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship {
    // Внктренние классы имеют доступ к полям внешних классов
    public int x=10;
    public /*static*/ class Boat{
        // нельзя использовать в статическом методе нестатическую переменную
        public void test(){
            x=20;
        }
    }
}
