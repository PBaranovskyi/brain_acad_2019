package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn4;

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
        if (this.listOfAnimals== null) {
            this.listOfAnimals=new Animal[]{someAnimals[0]};
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
