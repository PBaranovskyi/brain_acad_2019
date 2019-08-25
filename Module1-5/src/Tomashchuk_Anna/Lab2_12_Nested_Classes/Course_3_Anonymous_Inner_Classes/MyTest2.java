package Tomashchuk_Anna.Lab2_12_Nested_Classes.Course_3_Anonymous_Inner_Classes;

interface MyTest2 {
    void test();
}

class Ship2 {
    private int x=10;
    void doJob(){
       // Вы знаете что будете использлвать этот класс только 1 раз.
       // и Все, больше он вам не понадобится
     //////////////////
        //declaration of anonymous class
        //Анонимный класс имеет доступ к членам его внешнего класса
        final int y=20;
        MyTest3 tst=new MyTest3() {
            public void test() {
                System.out.println(x+y);
            }
        };
     //////////////////

        tst.test();
    }
}
