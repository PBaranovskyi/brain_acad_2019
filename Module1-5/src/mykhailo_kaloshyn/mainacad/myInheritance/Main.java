package mykhailo_kaloshyn.mainacad.myInheritance;

public class Main {

    public static void main(String[] args) {

        Zoo zooN1 = new Zoo();
        zooN1.setZooName("Kyiv's zoo");

        Bear bear = new Bear("bear Toy");

        Goat goat = new Goat("goat Angela");

        Tiger tiger = new Tiger("tiger Tigra");

        zooN1.takeAnimals(Animal.createArrayOfAnimals(bear, goat, tiger));

    }
}
