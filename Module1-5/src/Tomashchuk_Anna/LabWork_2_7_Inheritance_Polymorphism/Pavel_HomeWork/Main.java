package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Pavel_HomeWork;

public class Main {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.setName("Тузик");

        Bear bear=new Bear();
        bear.setName("Миша");

        Goat goat=new Goat();
        goat.setName("Дуся");

        Zoo[] zoos=new Zoo[3];
        zoos[0]=new Tiger();
        zoos[1]=new Bear();
        zoos[2]=new Goat();

        for(int i=0; i<zoos.length; i++){
            zoos[i].adoptAnimals();
        }

        System.out.println(tiger.getName());
        System.out.println(bear.getName());
        System.out.println(goat.getName());

    }
}
