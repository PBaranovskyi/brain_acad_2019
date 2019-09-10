package tereshchenko_roman.methodOverloadResolution;

public class Main {

    public static void foo (Animal animal){
        System.out.println("Animal");
    }

    public static void foo (Dog dog) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Dog dog = new Dog();

        foo(a);

        foo(dog);
    }
}
