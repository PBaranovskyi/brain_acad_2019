package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship_5 {
    // Внктренние классы имеют доступ к полям внешних классов
    private int x = 10;

    protected class Engine{
        // Нестатический класс имеет доступ к нестатическим переменным внешнего класса
      public void test(){
          x=20;
      }
    }
}
