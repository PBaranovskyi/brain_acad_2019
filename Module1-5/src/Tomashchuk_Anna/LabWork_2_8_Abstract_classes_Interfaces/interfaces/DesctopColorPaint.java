package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.interfaces;

import mainclasses.inheritance2.Tiger;
import mainclasses.inheritence4.SuperCar;
import mainclasses.interfaces.HasColor;


public class DesctopColorPaint {


    public static void main(String[] args) {
       SuperCar superCar = new SuperCar(200);
       superCar.setColor("Blue");

        paintDesktop(superCar);


        Tiger tiger = new Tiger();
        tiger.setColor("Green");

        paintDesktop(tiger);

        tiger.setColor("Yello");

        paintDesktop(tiger);
    }

    public static void paintDesktop(HasColor obj){
        if (obj.getColor() == null){
            System.out.println("Красим в " + HasColor.DEFAULT_COLOR);
        } else {
            System.out.println("Красим в " + obj.getColor());
        }

    }
}


