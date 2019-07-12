package mykhailo_kaloshyn.mainacad.myInheritance;

import mainclasses.inheritance2.Animal;

public class Goat extends Animal {
    public Goat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println( "Custom logic");
    }
}
