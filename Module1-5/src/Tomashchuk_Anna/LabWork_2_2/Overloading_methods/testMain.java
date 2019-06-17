package LabWork_2_2.Overloading_methods;

public class testMain {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.test(100);
        myCar.test("AAA");
        myCar.test(new int[]{1,2,3});
       // myCar.test(10,3,5);

    }
}
