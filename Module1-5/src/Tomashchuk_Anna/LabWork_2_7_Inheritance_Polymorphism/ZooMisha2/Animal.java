package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooMisha2;

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

    // создаем массив Varargs - чтобы можно было передать любое количество значений
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

