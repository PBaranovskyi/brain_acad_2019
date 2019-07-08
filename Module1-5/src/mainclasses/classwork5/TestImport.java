package mainclasses.classwork5;

import mainclasses.inheritance.Animal;
import mainclasses.inheritance.Bear;
import mainclasses.inheritance.Tiger;

public class TestImport {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Тигр Тузик");
        tiger.eat(tiger);
        tiger.may();
        tiger.setTailLength(10);

        Bear bear = new Bear();
        bear.setName("медведь Михаил");
        bear.eat(tiger);
        bear.fishing();

        Animal chupakabra = new Animal();
        chupakabra.setName("Чупакабра Оля");
        chupakabra.eat(chupakabra);
    }
}
