package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooMisha2;

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
        if (this.listOfAnimals == null) {
            this.listOfAnimals = new Animal[]{someAnimals[0]};
        }

        for (int i = 0; i < someAnimals.length; i++) {

            int count = 0;

            for (int j = 0; j < this.listOfAnimals.length; j++) {
                if (someAnimals[i].equals(listOfAnimals[j])) {
                    count++;
                }
            }

        }


        for (Animal animal : this.listOfAnimals) {
            System.out.print("[" + animal.getName() + ", "+ animal.getAge() + "] ");
        }
    }
}

