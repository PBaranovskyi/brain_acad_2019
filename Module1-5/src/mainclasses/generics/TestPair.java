package mainclasses.generics;

import mainclasses.inheritence4.Car;

public class TestPair {


    public static void main(String[] args) {

        Pair<Long, String> pairWithString = new Pair<>(23L, "Kiev, Kreschatic 23");

        Long keyL = pairWithString.getKey();
        String value = pairWithString.getValue();

        Pair<Integer, Car> pairWithCar = new Pair<>(23, new Car(11));


        Car car =  pairWithCar.getValue();


        Pair<Long, String> pairWithStrin2 = new Pair<>(23L, "Kiev, Kreschatic 25");



        boolean compare = Util.compare(pairWithString, pairWithStrin2);

        System.out.println(compare);


    }
}
