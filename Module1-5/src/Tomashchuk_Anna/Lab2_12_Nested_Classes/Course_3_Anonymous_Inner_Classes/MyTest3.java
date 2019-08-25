package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_3_Anonymous_Inner_Classes;

interface MyTest3 {
    void test();
}

class Ship3 {
    void doJob(){
        MyTest3 tst=new MyTest3() {
       private int z=10;
            {
                System.out.println("Init block");
            }
            public void test(){
                System.out.println(z);
            }
        };

        tst.test();
    }
}
