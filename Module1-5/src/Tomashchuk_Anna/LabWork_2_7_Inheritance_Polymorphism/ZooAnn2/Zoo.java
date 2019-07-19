package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn2;

public class Zoo {
    private String zooName;
    private Animal[] listOfAnimals;

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

    public void showAnimas(Animal[] showAnimals){

    }

}
