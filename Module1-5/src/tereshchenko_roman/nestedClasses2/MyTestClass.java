package tereshchenko_roman.nestedClasses2;

public class MyTestClass {

    public void test() {
    }

    ;

    static class v {
        static v V = new v();
        public static String staticNested = "staticNested";
    }

    class MyInner {
        MyInner myInner = new MyInner();
        public String inner = "inner";
    }

    public void myLocalMethod() {
        class MyLocal {
            MyLocal myLocal = new MyLocal();
            public String local = "local";
        }

    }

}
