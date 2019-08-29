package tereshchenko_roman.generics;

public class Main {

    public static void main(String[] args) {

        MyTuple <String, Integer, Long> mt1 = new MyTuple<>("MyTuple1", 5, 25L);
        MyTuple <Double, String, String> mt2 = new MyTuple<>(2.56, "MyTuple2", "MyTuple2-1");
    }
}
