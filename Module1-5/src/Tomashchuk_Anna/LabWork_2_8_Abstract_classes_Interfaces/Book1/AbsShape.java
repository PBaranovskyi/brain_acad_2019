package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Book1;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape shapes[]=new TwoDShape[4];

        shapes[0]=new Triangle("контурный", 8.0, 12.0);
        shapes[1]=new Rectangle();
        shapes[2]=new Rectangle(10,4);
        shapes[3]=new Triangle(7.0);

        for(int i=0; i<shapes.length; i++){
            System.out.println("Объект - " +shapes[i].getName());
            System.out.println("Площадь - "+ shapes[i].area());
            System.out.println();
        }

    }
}
