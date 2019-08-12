package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Book1;

public class Rectangle extends TwoDShape {

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        super(w,h,"прямоугольник");
    }

    Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare(){
        if(getWidth()==getHeigth()) return true;
        return false;
    }

    double area(){
        return getWidth()*getHeigth();
    }

}
