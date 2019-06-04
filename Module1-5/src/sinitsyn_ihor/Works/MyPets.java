package sinitsyn_ihor.Works;

import java.util.Scanner;

public class MyPets {
    public static void main(String[] args) {
        Scanner myPet = new Scanner(System.in);
        Animal wolf = new Animal();
        Animal monkey = new Animal();
        wolf.setLegs(4);
        boolean mam =  wolf.isMamal();
        System.out.print("You can get name for a wolf: ");
        String wolfName = myPet.nextLine();
        monkey.setLegs(4);
        monkey.isMamal();
        System.out.print("You can get name for a monkey: ");
        String monkeyName = myPet.nextLine();
        System.out.println("Wolf is mamal? " + mam);
        System.out.println("How many legs? " + wolf.getLegs());
        System.out.println("Wolf name is " + wolfName);
        System.out.println("Monkey is mamal? " + mam);
        System.out.println("How many legs? " + wolf.getLegs());
        System.out.println("Monkey name is " + monkeyName);
    }
}
