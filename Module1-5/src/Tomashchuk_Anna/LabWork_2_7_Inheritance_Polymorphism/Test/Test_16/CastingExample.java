package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_16;

public class CastingExample {
    public static void main(String[] args) {
        Monster monster1=new Dragon();
        Monster monster2=new Orc();

        ((Orc)monster1).say();
        ((Dragon)monster2).say();
    }
}
