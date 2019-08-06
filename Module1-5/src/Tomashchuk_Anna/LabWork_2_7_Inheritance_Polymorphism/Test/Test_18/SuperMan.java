package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_18;

public class SuperMan extends Person {
    String skils;
    SuperMan(String skils, String name){
        super();
        this.skils=skils;

    }

    public String toString(){
        return name+"has"+skils;
    }

}
