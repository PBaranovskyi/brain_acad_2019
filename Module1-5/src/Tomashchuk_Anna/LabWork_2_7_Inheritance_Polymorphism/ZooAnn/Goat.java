package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn;

public class Goat extends Animal {
    public Goat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Custom logic");
    }
}
