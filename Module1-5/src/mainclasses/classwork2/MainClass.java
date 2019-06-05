package mainclasses.classwork2;

public class MainClass {

    public static void main(String[] args) {

        // создать 2 объекта, которые животные
        Animal obj1 = new Animal();
        Animal obj2 = new Animal();

        // 1 обект иметь имя "обезъянка Оля"
        // 1 объект получит имя "волк Петя", если нет имени - вывести "животное"


        obj1.setName("обезъянка Оля");
        obj2.setName("волк Петя");

        obj1.setLegs(4);
        obj2.setLegs(4);

        obj1.setMamal(true);

        // Дать им имена


        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        // Вывести их имена на экран

    }

}
