package mainclasses.inheritance2;

public class Zoo {

    private String zooName;
    private Animal[] listOfAnimals;
    private Tiger[] listOfTigers;

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

            if (animal instanceof Chupacabra) {
                continue;
            }

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

    public void springIsComing() {
        for (int i = 0; i < listOfAnimals.length - 1; i++) {
            Animal first = listOfAnimals[i];
            for (int j = i + 1; j < listOfAnimals.length; j++) {
                Animal second = listOfAnimals[j];

                if (first == second && first.canMultiplyAlone()) {
                    continue;
                }
                Animal baby = first.multiply(second);

                if (baby != null) {
                    System.out.println("Success " + baby.getName());
                }
            }
        }

    }


}

