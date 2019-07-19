package mykhailo_kaloshyn.mainacad.myInheritance;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

    /*static Animal[] createArrayOfAnimals(Animal... animals) {
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
    }*/

    static Animal[] createArrayOfAnimals(Animal... animals) {

        return animals;
    }

    public boolean equals(Animal animal) {
        boolean theSameAnimal;
        if (this.getClass().toString().equals(animal.getClass().toString()) && this.getName().equals(animal.getName()) &&
                this.getAge() == animal.getAge()) {
            theSameAnimal = true;
        } else {
            theSameAnimal = false;
        }
        return theSameAnimal;
    }
}

