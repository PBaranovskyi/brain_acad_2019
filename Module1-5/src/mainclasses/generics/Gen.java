package mainclasses.generics;

import mainclasses.inheritance2.Animal;
import mainclasses.inheritance2.Bear;
import mainclasses.inheritance2.Tiger;
import mainclasses.inheritence4.Car;

import java.util.ArrayList;

public class Gen {

    public static void main(String[] args) {

       Car[] cars = { new Car(20), new Car(50)};
       Car[] cars2 = { new Car(20), new Car(50)};

       Car[] cars3 = addArray(cars, cars2);


        Animal[] animals = {};
        Animal[] animals2 = {};

        Car[] animals1 = addArray(cars, animals);


        ArrayList<Animal> animalsList = new ArrayList<>();

        animalsList.add(new Tiger());

        animalsList.add(new Bear());

        Animal animal = animalsList.get(0);

    }


    public static <T, E> T[] addArray(T[] target, E[] source) {
        assert target != null;

        for (int i = 0; i < source.length; i++) {

            int count = 0;

            for (int j = 0; j < target.length; j++) {
                if (source[i].equals(target[j])) {
                    count++;
                }
            }
        }
        return target;
    }



}
