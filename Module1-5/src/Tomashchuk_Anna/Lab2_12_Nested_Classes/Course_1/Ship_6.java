package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship_6 {
    // Внутренние классы имеют доступ к полям внешних классов
    private int x = 10;

    protected class Engine {
        // Нестатический класс имеет доступ к нестатическим переменным внешнего класса
        // Если хотите переменные называть одинаково
        public void test() {
           int x=100; // x - длина у Engine
           Ship_6.this.x=20; // Ship_6.this.x - Длина у корабля Ship
        }
    }
}
