package sinitsyn_ihor.Works;

public class MyPets {
    public static void main(String[] args) {
        Animal wolf = new Animal();
        Animal monkey = new Animal();
        wolf.setLegs(4);
        monkey.setLegs(2);
        wolf.setMamal(true);
        monkey.setMamal(true);
        wolf.setName("ЗаходиЕслиЧто");
        monkey.setName("ЧиЧиЧи");
        System.out.println("Wolf is mamal? " + wolf.isMamal());
        System.out.println("How many legs? " + wolf.getLegs());
        System.out.println("Wolf name is " + wolf.getName());
        System.out.println("Monkey is mamal? " + monkey.isMamal());
        System.out.println("How many legs? " + monkey.getLegs());
        System.out.println("Monkey name is " + monkey.getName());
    }
}
