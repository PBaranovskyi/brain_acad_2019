package mykhailo_kaloshyn.mainacad.myInheritance;

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

    void takeAnimals(Animal[] someAnimals) {
        this.listOfAnimals = someAnimals;
        for (int i = 0; i < this.listOfAnimals.length; i++) {
            System.out.print("[" + this.listOfAnimals[i].getName() + "] ");
        }

    }
}

