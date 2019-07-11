package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_4_Constructor;

// Добавление конструктора в класс Triangle
public class TwoDShape {
    public double width; // теперь эти переменные объявлены как закрытые
    public double heigth;

    // Методы доступа к закрытым переменным экземпляра width и heigth
    double getWidth(){return width;}
    double getHeigth(){return heigth;}
    void setWidth(double width){this.width=width;}
    void setHeigth(double heigth){this.heigth=heigth;}

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + heigth);
    }


}
