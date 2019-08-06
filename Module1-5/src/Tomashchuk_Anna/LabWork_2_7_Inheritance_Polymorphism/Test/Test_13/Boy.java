package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_13;

public class Boy {
    String name;
    int age;
    Boy(String name, int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object o){
        if(((Boy)o).name==this.name)
            return true;
        else return false;
    }
}
