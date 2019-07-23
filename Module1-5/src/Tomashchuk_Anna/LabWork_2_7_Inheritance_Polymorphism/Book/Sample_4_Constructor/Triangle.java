package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Book.Sample_4_Constructor;

public class Triangle extends TwoDShape {
    private String style;

    //Конструктор
    Triangle(String s, double w, double h){
        setWidth(w); // Инициализация части объекта соответствующей классу TwoDShape
        setHeigth(h); // Инициализация части объекта соответствующей классу TwoDShape

        style=s;
    }

    double area() {
        return getWidth()*getHeigth()/2;
    }

    void showStyle(){
        System.out.println("Треугольник "+style);
    }

}
