package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zoo zooN1 = new Zoo();
        zooN1.setZooName("Kyiv's zoo");

        Bear bear = new Bear("bear Toy");

        Goat goat = new Goat("goat Angela");

        Tiger tiger1 = new Tiger("tiger Vasya", 3);
        Tiger tiger2 = new Tiger("tiger Vasya", 3);
        Tiger tiger3 = new Tiger("tiger Petya", 4);

        Animal[][] arr1 = {{bear, goat, tiger1}, {bear, goat, tiger2}, {bear, goat, tiger3}};
        Zoo zooN2 = new Zoo();
        zooN2.setZooName("Lviv's zoo");


        // Массив животных
        Animal[] arr = {bear, goat, tiger1, tiger2, tiger3};

        //Зоопарк принимает массив животных
        zooN1.takeAnimals(arr); //[bear Toy] [goat Angela] [tiger Tigra]

        zooN1.feedAnimals(); //prepareFood
        //bear Toy поел

        System.out.println(Arrays.toString(arr)); // [ name: bear Toy,  name: goat Angela,  name: tiger Tigra]

        // В class Animal  прописано условие
        // Если возраст и имя у Animal  одинаковые, тогда считаем что они равны - equals=true
        System.out.println(tiger1.equals(tiger2)); // true
        System.out.println(tiger1.equals(tiger3)); // false  "Vasya", 3  И "Vasya",4

        System.out.println(Arrays.deepToString(arr1));

    }
}
