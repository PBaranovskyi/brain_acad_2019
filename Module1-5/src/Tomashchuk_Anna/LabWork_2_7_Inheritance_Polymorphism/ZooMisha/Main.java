package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooMisha;

public class Main {

    public static void main(String[] args) {

        Zoo zooN1 = new Zoo();
        zooN1.setZooName("Kyiv's zoo");

        Bear bear1 = new Bear("bear Toy", 7);
        Goat goat = new Goat("goat Angela", 2);
        Goat goat2 = new Goat("goat Angela", 2);
        Tiger tiger = new Tiger("tiger Tigra", 3);

        zooN1.takeAnimals(Animal.createArrayOfAnimals(bear1, goat, goat2, tiger));
        System.out.println();

        Bear bear2 = new Bear("bear Jay", 5);
        Goat goat3 = new Goat("goat Angela", 3);
        Snake snake = new Snake("snake Lo", 11);
        Snake snake2 = new Snake("snake Lo", 11);
        Wolf wolf = new Wolf("wolf Grey", 7);

        zooN1.takeAnimals(Animal.createArrayOfAnimals(bear2, goat3, snake, snake2, wolf, bear1));

    }
}
