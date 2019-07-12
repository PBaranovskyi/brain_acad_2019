package Tomashchuk_Anna.LabWork_2_2_Methods.Overloading_methods_1;

public class Overload {
    //Первая версия
    public void ovlDemo() {
        System.out.println("Без параметров");
    }

    //Вторая версия
    //Перегрузка метода ovlDemo для одного параметра типа int
    public void ovlDemo(int a) {
        System.out.println("Один параметр: " + a);
    }

    //Третья версия
    //Перегрузка метода ovlDemo для двух параметров типа int
    public int ovlDemo(int a, int b) {
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }

    //Четвертая версия
    //Перегрузка метода ovlDemo для двух параметров типа double
    public double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double : " + a + " " + b);
        return a + b;
    }

}
