package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_5;

public class CastingExample {
    public static void main(String[] args) {
        Monster monster1=new Dragon();
        Monster monster2=new Orc();
        ((Dragon)monster1).say();
        ((Orc)monster2).say();
    }
}
