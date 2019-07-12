package tereshchenko_roman.inheritanceAndPolymorphism;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
//    private String name = "Тигр";
//
//    public String getName() {
//        return name;
//    }

    public String toString(){
        return "Tiger";
    }
}

class Bear extends Animal {
//    private String name = "Медведь";
//
//    public String getName() {
//        return name;
//    }

    public String toString(){
        return "Bear";
    }
}

class Goat extends Animal {
//    private String name = "Коза";
//
//    public String getName() {
//        return name;
//    }

    public String toString(){
        return "Goat";
    }
}

