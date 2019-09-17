package mainclasses.collections;

import mainclasses.inheritence4.Car;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static final int size = 1000000;

    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();
        Collection<Integer> toRemove = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(8);

        toRemove.add(5);
        toRemove.add(9);


        list.removeAll(toRemove);

        Integer[] integers = list.toArray(new Integer[0]);

        System.out.println(list);

        Car c = new Car(1);

        for(Car item :c){
            System.out.println(item.getMaxSpeed());
        }

        for (Integer integer : list) {

        }


        Long timeStart = System.currentTimeMillis();
        List<String>  list1 = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            list1.add("sdfdsfdf");
//        }
//
//        for (int i = 0; i < 10000; i++) {
//            list1.add(0, "sdfdsfdf2");
//        }
        Long timeEnd = System.currentTimeMillis();

        System.out.println("Array List: " + (timeEnd-timeStart));

        Long timeStart2 = System.currentTimeMillis();
        List<String>  list2 = new LinkedList<>();
//        for (int i = 0; i < size; i++) {
//            list2.add("sdfdsfdf");
//        }
//
//        for (int i = 0; i < 10000; i++) {
//            list2.add(0, "sdfdsfdf2");
//        }
        Long timeEnd2 = System.currentTimeMillis();

        System.out.println("Linked List: " + (timeEnd2-timeStart2));


        Map<String, Car> carMap = new HashMap<>();
        carMap.put("Honda", new Car(200));
        carMap.put("Zhugul", new Car(100));
        carMap.put("Porche", new Car(300));
        System.out.println(carMap);
        System.out.println(carMap.entrySet());

        for (String key : carMap.keySet()) {
            Car car = carMap.get(key);
            System.out.println(car);
        }

        int index = Collections.binarySearch(list, 5);
        List<Integer> listUnmodify = Collections.unmodifiableList(list);

        System.out.println(listUnmodify);

//        listUnmodify.add(10);

        OverloadTest ot = new OverloadTest(); ot.dojob(1);
       ot.dojob(1.0);

        double var = 0;
        BigDecimal dec = new BigDecimal("" + var);
        dec.setScale(10, RoundingMode.HALF_UP);
        BigDecimal result = dec.add(new BigDecimal("1.1"));
        result.setScale(10, RoundingMode.HALF_UP);

        for (BigDecimal x = dec ; x.compareTo(result) < 0; x.add(dec) ) {
            System.out.println(x.doubleValue());
        }

    }
}
