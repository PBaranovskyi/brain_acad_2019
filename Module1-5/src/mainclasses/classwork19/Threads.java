package mainclasses.classwork19;

import java.util.concurrent.atomic.AtomicInteger;

public class Threads {

    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.getAndIncrement();
            }
        });


        thread1.start();

        for (int i = 0; i < 1_000_000; i++) {
            counter.getAndIncrement();
        }

        System.out.println(counter.get());

    }
}
