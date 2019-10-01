package mainclasses.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {


        Random random = new Random();

//        random.ints().forEach(randomInt -> System.out.println(randomInt));


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i);
//                test(i);
            }
        }
        long endTime1 = System.currentTimeMillis() - startTime1;

        long startTime2 = System.currentTimeMillis();
        IntStream.range(1, 5_000_000).sequential().filter(e -> ((e % 2 == 0) && (e % 3 == 0))).forEach(System.out::println);
        long endTime2 = System.currentTimeMillis() - startTime2;

        System.out.println( "First time:" + endTime1);
        System.out.println("Second time:" + endTime2);
    }

//    static void test(int i){
//
//    }
}
