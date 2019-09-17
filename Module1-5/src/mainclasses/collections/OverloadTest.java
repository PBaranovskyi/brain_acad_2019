package mainclasses.collections;

public class OverloadTest {
    void dojob(Object o) {
        System.out.println("Object");
    }

    void dojob(Number i) {
        System.out.println("Number");
    }

    void dojob(Integer i) {
        System.out.println("Integer");
    }
}