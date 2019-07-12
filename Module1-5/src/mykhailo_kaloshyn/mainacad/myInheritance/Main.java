package mykhailo_kaloshyn.mainacad.myInheritance;

import mainclasses.inheritance2.Animal;
import mainclasses.inheritance2.Zoo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Zoo zooN1 = new Zoo();
        zooN1.setZooName("Kyiv's zoo");

        Bear bear = new Bear("bear Toy");

        Goat goat = new Goat("goat Angela");

        Tiger tiger = new Tiger("tiger Tigra");

        Animal[] arr = {bear, goat, tiger};

        zooN1.takeAnimals(arr);
        zooN1.feedAnimals();

        System.out.println(Arrays.toString(arr));

    }
}
