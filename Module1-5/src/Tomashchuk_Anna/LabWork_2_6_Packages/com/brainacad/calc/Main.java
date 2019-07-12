package Tomashchuk_Anna.LabWork_2_6_Packages.com.brainacad.calc;

import Tomashchuk_Anna.LabWork_2_6_Packages.com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7, 3);
        System.out.println(triangle.getArea());
    }
}
