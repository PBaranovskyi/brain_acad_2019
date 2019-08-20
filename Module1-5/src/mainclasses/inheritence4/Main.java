package mainclasses.inheritence4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args)  throws CloneNotSupportedException {

        Car car = new Car(200);

        Car copy = car.copyCar();

        Car[] cars = new Car[3];

        cars[0] = car;
        cars[1] = new SuperCar(300);
        cars[2] = new RetroCar(50, "Volga");

        System.out.println(copy.getMaxSpeed());

        System.out.println(copy == car);

        createCopyOfRetroCar(cars);

        Car old = new OldRetroCar(30, "ford");

        System.out.println(old instanceof RetroCar);

        RetroCar retro = (RetroCar) old;
        RetroCar retroDuplicate = retro.clone();


        System.out.println(old.getClass() == RetroCar.class);

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        String first = "Vasya";
        String second = "human";
        String third = "adress";
        String forth = "Vasiliy";

        String[] arr = {first, second, third, forth};

        System.out.println(first.compareTo(second));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    private static void createCopyOfRetroCar(Car[] cars) {
        for (Car car : cars) {
            if (car.getClass() == RetroCar.class) {
                RetroCar retro = (RetroCar) car;
                System.out.println("We found retrocar");

                try {
                    RetroCar copy = retro.clone();
                    System.out.println(copy.getMaxSpeed());
                    System.out.println(copy.getName());
                    copy.fix();
                } catch (CloneNotSupportedException e) {
                    retro.fix();
                }
                System.out.println("final");

            }
        }

    }

}
