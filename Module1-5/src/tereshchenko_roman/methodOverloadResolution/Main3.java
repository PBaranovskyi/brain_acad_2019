package tereshchenko_roman.methodOverloadResolution;

public class Main3 {

    public static void main(String[] args) {

        Animal dog = new Dog();
        foo(dog);
        foo (new Animal());
        foo(new Dog());
        Dog puppy = new Dog();
        foo(puppy);
        foo(new Puppy());
    }

    public static void foo (Animal a){
        System.out.println("Animal");
    }

    public static void foo (Dog d) {
        System.out.println("Dog");
    }

    public static void foo (Puppy p) {
        System.out.println("Puppy");
    }
}
