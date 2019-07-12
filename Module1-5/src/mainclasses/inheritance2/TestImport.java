package mainclasses.inheritance2;

public class TestImport {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Тигр Тузик");
        tiger.setLegs(4);
        tiger.eat();
        tiger.setTailLength(10);

        System.out.println("У тигра " + tiger.countYourLegs());

        System.out.println("=========");


        Bear bear = new Bear();
        bear.setName("медведь Михаил");
        bear.eat();
        bear.fishing();

        Animal chupakabra = new Animal();
        chupakabra.setName("Чупакабра Оля");
        chupakabra.eat();
    }
}
