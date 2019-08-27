package mainclasses.generics2;

import mainclasses.inheritence4.RetroCar;
import tereshchenko_roman.classesAndInstances.Additional_Practice_Works.AWP3.Person;

public class TestGen {

    public static void main(String[] args) {
        Person driver1 = new Person();
        driver1.setName("Pasha Bar");

        CarWithDriver car = new CarWithDriver();
        car.setDriver(driver1);

        PoliceDbRaw<String, CarWithDriver> raw1 = new PoliceDbRaw<>(driver1.getName(), car);

        CarWithDriver car1 = raw1.getCar();


        RetroCar retro = new RetroCar(100, "Ford");

        PoliceDbRaw<String, RetroCar> raw2 = new PoliceDbRaw<>("Kolya", retro);

        RetroCar car2 = raw2.getCar();


        testMethod(raw2);
        testMethod(raw1);

    }

    private static void testMethod(PoliceDbRaw<?, ?> raw2) {

    }


}
