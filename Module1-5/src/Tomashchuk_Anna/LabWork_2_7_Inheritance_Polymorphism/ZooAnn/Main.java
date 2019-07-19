package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zoo zooN1 = new Zoo();
        zooN1.setZooName("Kyiv's zoo");

        Bear bear = new Bear("bear Toy");

        Goat goat = new Goat("goat Angela");

        Tiger tiger = new Tiger("tiger Tigra");

        // Массив животных
        Animal[] arr = {bear, goat, tiger};
        //Зоопарк принимает массив животных
        zooN1.takeAnimals(arr); //[bear Toy] [goat Angela] [tiger Tigra]

        zooN1.feedAnimals(); //prepareFood
        //bear Toy поел

        System.out.println(Arrays.toString(arr)); // [ name: bear Toy,  name: goat Angela,  name: tiger Tigra]

    }
}
