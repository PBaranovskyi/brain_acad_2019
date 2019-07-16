package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn3;

public class Zoo {
    private String zooName;
    private Animal[] listOfAnimals;
    private Animal[][] listTwoDimen;

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public Animal[] getListOfAnimals() {
        return listOfAnimals;
    }

    public void takeAnimals(Animal[] someAnimals) {
        this.listOfAnimals = someAnimals;

        for (Animal animal : this.listOfAnimals) {
            System.out.print("[" + animal.getName() + "] ");
        }
    }

    public Animal[][] getListTwoDimen() {
        return listTwoDimen;
    }

    public void takeAnimalsTwoDimen(Animal[][] twoDAnimals) {
        this.listTwoDimen = twoDAnimals;

        for (Animal animal : this.listOfAnimals) {
            System.out.print("[" + animal.getName() + "] ");
        }


    }

    public void feedAnimals() {
        if (listOfAnimals == null) {
            System.out.println("Нет животных в зоопарке");
            return;
        }

        for (Animal animal : listOfAnimals) {
            System.out.println("====================");
            animal.eat();
        }
    }



}
