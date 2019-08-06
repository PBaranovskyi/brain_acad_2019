package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_13;

import Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_3.B;

public class Main {
    public static void main(String[] args) {
        Boy k1=new Boy("Boris",32);
        Boy k2=new Boy("Boris",30);
        System.out.println(k1.equals(k2));
    }
}
