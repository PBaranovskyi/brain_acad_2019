package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_1;

//Подкласс для представления треугольников производный от класса TwoDShape
// класс Triangle наследует класс TwoDShape
public class Triangle extends TwoDShape {
    String style;

    // Из класса Triangle можно обращаться к членам класса TwoDShape так, как если бы это
    // были его собственные члены
    double area(){
        return width*heigth/2;
    }

    void showStyle(){
        System.out.println("Треугольник "+style);
    }
}
