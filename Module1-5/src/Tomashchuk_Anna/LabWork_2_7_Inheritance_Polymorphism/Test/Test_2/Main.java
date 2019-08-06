package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_2;

public class Main {
    static int countOfCats=0;

    public static void main(String[] args) {
        Animal[] animals={new Cat(), new Dog(), new Cat()};
        for(Animal a:animals){
            if(a instanceof Cat)
                countOfCats++;
        }
        System.out.println(countOfCats);
    }
}
