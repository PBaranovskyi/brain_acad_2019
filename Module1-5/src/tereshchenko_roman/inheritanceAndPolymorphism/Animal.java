package tereshchenko_roman.inheritanceAndPolymorphism;

public class Animal {
}

class Tiger extends Animal {
    private String name = "Тигр";

    public String getName() {
        return name;
    }
}

class Bear extends Animal {
    private String name = "Медведь";

    public String getName() {
        return name;
    }
}

class Goat extends Animal {
    private String name = "Коза";

    public String getName() {
        return name;
    }
}

