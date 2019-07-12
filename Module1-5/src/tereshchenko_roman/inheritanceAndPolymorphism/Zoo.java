package tereshchenko_roman.inheritanceAndPolymorphism;

public class Zoo {

    public void getAnimals(Animal[] zooAnimals) {
        for (int i = 0; i < 3; i++) {
            System.out.println(zooAnimals[i]);
        }
    }

//    public void getAnimalNames(String[] zooAnimalsNames) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(zooAnimalsNames[i]);
//        }
//    }

    public static void main(String[] args) {

        Zoo zoo1 = new Zoo();
        Tiger tiger1 = new Tiger();
        Bear bear1 = new Bear();
        Goat goat1 = new Goat();

        Animal[] zooAnimals = new Animal[3];
        zooAnimals[0] = tiger1;
        zooAnimals[1] = bear1;
        zooAnimals[2] = goat1;

//        String[] zooAnimalsNames = new String[3];
//        zooAnimalsNames[0] = tiger1.getName();
//        zooAnimalsNames[1] = bear1.getName();
//        zooAnimalsNames[2] = goat1.getName();

        zoo1.getAnimals(zooAnimals);
//        zoo1.getAnimalNames(zooAnimalsNames);
    }
}
