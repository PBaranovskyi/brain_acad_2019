package tereshchenko_roman.inheritanceAndPolymorphism;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Animal animal) {
        if (this.name == animal.name && this.age == animal.age) return true;
        return false;
    }
}

class Tiger extends Animal {

    public Tiger(String name, int age) {
        super(name, age);
    }
}

class Bear extends Animal {

    public Bear(String name, int age) {
        super(name, age);
    }
}

class Goat extends Animal {

    public Goat(String name, int age) {
        super(name, age);
    }
}

