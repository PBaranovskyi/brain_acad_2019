package mainclasses.inheritance2;

public class TestImport {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Тигр Тузик");
        tiger.setLegs(4);
//        tiger.eat();
        tiger.setTailLength(10);

        System.out.println("У тигра " + tiger.countYourLegs());

        System.out.println("=========");


        Bear bear = new Bear();
        bear.setName("медведь Михаил");
//        bear.eat();
        bear.fishing();

        Animal chupakabra = new Chupacabra();
        chupakabra.setName("Чупакабра Оля");
//        chupakabra.eat();


        Tiger tiger3 = new Tiger();
        tiger3.setName("Musya");

        Zoo kievZoo = new Zoo();

        kievZoo.feedAnimals();

        Animal[] animals = {bear, tiger, chupakabra, tiger3};
        kievZoo.takeAnimals(animals);

        kievZoo.feedAnimals();

        Tiger tiger2 = new Tiger();
        tiger2.setName("Тигр Тузик");
        tiger2.setLegs(4);
//        tiger.eat();
        tiger2.setTailLength(10);



        System.out.println(tiger.equals(tiger2));

        if (Bear.class instanceof Class) {
            System.out.println("Class comparison :" + true);
        }

        if (tiger2 instanceof Animal) {
            System.out.println("tiger is animal" + true);
        }

        kievZoo.springIsComing();

    }
}
