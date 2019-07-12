package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_1;

//Подкласс для представления прямоугольников,
// производный от класса TwoDShape
public class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == heigth) return true;
        return false;
    }

    double area(){
        return width*heigth;
    }

}
