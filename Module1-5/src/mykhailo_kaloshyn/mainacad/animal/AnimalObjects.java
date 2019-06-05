package mykhailo_kaloshyn.mainacad.animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal MonkeyTanya = new Animal();

        MonkeyTanya.setMamal(true);
        MonkeyTanya.setPaws(4);
        MonkeyTanya.setName("MonkeyTanya");

        Animal WolfPetya = new Animal();

        WolfPetya.setMamal(true);
        WolfPetya.setPaws(4);

        System.out.println(WolfPetya.getName());
    }
}
