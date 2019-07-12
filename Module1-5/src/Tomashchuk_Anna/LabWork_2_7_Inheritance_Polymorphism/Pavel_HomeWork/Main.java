package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Pavel_HomeWork;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Тузик");

        Bear bear = new Bear();
        bear.setName("Миша");

        Goat goat = new Goat();
        goat.setName("Дуся");

        Zoo[] zoos = new Zoo[3];
        zoos[0] = new Tiger();
        zoos[1] = new Bear();
        zoos[2] = new Goat();

        for (int i = 0; i < zoos.length; i++) {
            //zoos[i].adoptAnimals();
            System.out.println(tiger.getName() + " " + bear.getName() + " " + goat.getName());

        }

        String[] animalsName = new String[3];
        animalsName[0] = tiger.getName();
        animalsName[1] = bear.getName();
        animalsName[2] = goat.getName();

        for (int y = 0; y < animalsName.length; y++) {
            System.out.println(animalsName[y]);
        }


    }
}
