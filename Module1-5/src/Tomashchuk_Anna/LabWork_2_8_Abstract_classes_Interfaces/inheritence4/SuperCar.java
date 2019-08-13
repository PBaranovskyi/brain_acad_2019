package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.inheritence4;

import mainclasses.interfaces.HasColor;


public class SuperCar extends Car implements HasColor {

    private String color;

    public SuperCar(int maxSpeed) {
        super(maxSpeed);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


