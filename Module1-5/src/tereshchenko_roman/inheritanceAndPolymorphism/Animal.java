package tereshchenko_roman.inheritanceAndPolymorphism;

public class Animal {
    private String name;
    private int age;

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
    private String name;
    private int age;

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Animal tiger) {
        if (this.name == name && this.age == age) return true;
        return false;
    }
}

class Bear extends Animal {
    private String name;
    private int age;

    public Bear(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Animal bear) {
        if (this.name == name && this.age == age) return true;
        return false;
    }
}

class Goat extends Animal {
    private String name;
    private int age;

    public Goat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Animal goat) {
        if (this.name == name && this.age == age) return true;
        return false;
    }
}



