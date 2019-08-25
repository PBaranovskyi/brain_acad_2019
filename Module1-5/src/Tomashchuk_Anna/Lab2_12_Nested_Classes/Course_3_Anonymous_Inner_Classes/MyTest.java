package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_3_Anonymous_Inner_Classes;

interface MyTest {
    void test();
}
class Ship{
    void doJob(){
       // Вы знаете что будете использлвать этот класс только 1 раз.
       // и Все, больше он вам не понадобится
     //////////////////
        //declaration of anonymous class
        MyTest3 tst=new MyTest3() {
            public void test() {
                System.out.println("Test");
            }
        };
     //////////////////

        tst.test();
    }
}
