package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_2_Local_Inner_Classes;

public class Ship_2 {
    private int x;
    void doJob(){
        // Можете в Java 8 не писать final, но она все-равно будет final
        int y=10; // скомпилится только если final
        class LocalClass{
            // локальный InnerClass - в методе можете объявить класс
            // Объект использовать типа temp , и только в этом объекте он есть
            public void test(){
                x=20;
                System.out.println(x+" "+y);
            }
        }
    }
}
