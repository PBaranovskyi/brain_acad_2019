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

    /*void takeAnimals(Animal[] someAnimals) {
        this.listOfAnimals = someAnimals;
        for (Animal animal : this.listOfAnimals) {
            System.out.print("[" + animal.getName() + "] ");
        }

    }*/

    public void takeAnimals2(Animal[] someAnimals) {

        Animal[] arr = checkIfDuplicates(someAnimals);

        if (this.listOfAnimals == null) {
            this.listOfAnimals = arr;
        } else {
            Animal[] combinedArray = combine(listOfAnimals, arr);
            listOfAnimals = checkIfDuplicates(combinedArray);
        }

    }

    public static Animal[] combine(Animal[] a, Animal[] b){
        int length = a.length + b.length;
        Animal[] result = new Animal[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }


    private Animal[] checkIfDuplicates(Animal[] someAnimals) {
        Animal duplicate;
        int counterDuplicates = 0;

        for (int j = 0; j < someAnimals.length; j++) {
            for (int i = 0; i < someAnimals.length; i++) {
                if (j == i) {
                    continue;
                }

                Animal someAnimal = someAnimals[i];
                duplicate = someAnimals[j];

                if (someAnimal != null && duplicate != null && duplicate.equals(someAnimal)) {
                    someAnimals[i] = null;
                    counterDuplicates++;
                }

            }
        }

        int lenthWithotDuplicates = someAnimals.length - counterDuplicates;
        Animal[] withoutDuplicates = new Animal[lenthWithotDuplicates];
        int newArrayCounter = 0;

        for (Animal someAnimal : someAnimals) {
            if (someAnimal != null) {
                withoutDuplicates[newArrayCounter] = someAnimal;
                newArrayCounter++;
            }
        }

        return withoutDuplicates;
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
            if (count == 0) {
                Animal[] additionalOneAnimal = {someAnimals[i]};
                Animal[] newListOfAnimals = new Animal[listOfAnimals.length + 1];
                System.arraycopy(listOfAnimals, 0, newListOfAnimals, 0, listOfAnimals.length);
                System.arraycopy(additionalOneAnimal, 0, newListOfAnimals, newListOfAnimals.length - 1, 1);
                this.listOfAnimals = newListOfAnimals;
            }
        }


        show();
    }

    public void show() {
        for (Animal animal : this.listOfAnimals) {
            System.out.print("[" + animal.getName() + ", " + animal.getAge() + "] ");
        }
    }
}

