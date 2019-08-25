package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_1;

public class Ship_7 {
    void doJob() {
        System.out.println("Ship");
    }

    protected class Engine {
        void doJob() {
            System.out.println("Engine");
        }

        public void test() {
            Ship_7.this.doJob(); // prints Ship
        }
    }
}
