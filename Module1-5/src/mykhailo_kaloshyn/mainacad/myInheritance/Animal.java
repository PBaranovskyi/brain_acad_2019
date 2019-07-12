package mykhailo_kaloshyn.mainacad.myInheritance;

public class Animal {

    private String name;

    /*public Animal() {

    }*/

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    static Animal[] createArrayOfAnimals(Animal... animals) {
        int calc = 0;
        for (Animal x : animals) {
            calc += 1;
        }

        Animal[] arrayOfAnimals = new Animal[calc];

        int animalID = 0;
        for (Animal x : animals) {
            arrayOfAnimals[animalID] = x;
            animalID += 1;
        }
        return arrayOfAnimals;
    }
}

