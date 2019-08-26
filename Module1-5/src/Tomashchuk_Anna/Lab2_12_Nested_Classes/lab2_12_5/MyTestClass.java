package Tomashchuk_Anna.Lab2_12_Nested_Classes.lab2_12_5;

public class MyTestClass {
    private int value = 10;

    public void test() {
        System.out.println("------------------------------------------------------");
        System.out.println("Access from the outer class to the static nested class");
        MyStaticNested myStaticNested = new MyStaticNested();
        System.out.println("The original value = " + myStaticNested.dd++);
        System.out.println("The changed value = " + myStaticNested.dd);

        System.out.println("\nAccess from the outer class to the inner class");
        MyInner myInner = new MyInner();
        System.out.println("The original value = " + myInner.ii--);
        System.out.println("The changed value = " + myInner.ii);
    }

    // static nested class MyStaticNested
    static class MyStaticNested {
        private double dd = 1.1;

        public void testStaticNested() {
            System.out.println("-------------------------------------------------------");
            System.out.println("Access from the static nested class to the outer class:");
            MyTestClass myTestClass = new MyTestClass();
            System.out.println("The original value = " + myTestClass.value);
            myTestClass.value++;
            System.out.println("The changed value = " + myTestClass.value);

            System.out.println("\nAccess the static nested class to the inner class");
            MyTestClass.MyInner obj = myTestClass.new MyInner();
            obj.printMessage();
        }

        public void printMessage() {
            System.out.println("The test was successful!!!");
        }
    }

    // inner class MyInner
    class MyInner {
        private int ii = -99;

        public void testInner() {
            System.out.println("------------------------------------------------------");
            System.out.println("Access from the inner class to the outer class:");
            System.out.println("The original value = " + value);
            System.out.println("The changed value = " + ++value);

            System.out.println("\nAccess from the inner class to the static nested class:");
            MyStaticNested obj = new MyStaticNested();
            obj.printMessage();
        }

        public void printMessage() {
            System.out.println("The test was successful!!!");
        }
    }

    // a method with local inner class MyLocal
    public void method() {
        final int x = 55;
//ocal inner class MyLocal
        class MyLocal {

            public void testLocalInner() {
                System.out.println("------------------------------------------------------");
                System.out.println("Access from the local inner class to the outer class, inner class and static class:");
                System.out.println("value (MyTestClass) = " + value);
                System.out.println("local variable (method) = " + x);

                MyInner myInner = new MyInner();
                System.out.println("ii (MyInner) = " + myInner.ii);

                MyStaticNested myStaticNested = new MyStaticNested();
                System.out.println("dd (MyStaticNested) = " + myStaticNested.dd);
            }
        }

        MyLocal myLocal = new MyLocal();
        myLocal.testLocalInner();
    }
}
