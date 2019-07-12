package bilan_max.InheritanceAndPolymorfysm.Zoo;

public class Zoo {
    public void acceptAnimal(Animal[] zooAnimal) {
        for (int i = 0; i < 3; i++) {
            System.out.println(zooAnimal[i]);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Tiger tiger = new Tiger();
        Bear bear = new Bear();
        Goat goat = new Goat();
        Animal[] zooAnimal = new Animal[3];
        zooAnimal[0] = tiger;
        zooAnimal[1] = bear;
        zooAnimal[2] = goat;
        zoo.acceptAnimal(zooAnimal);
    }
}
