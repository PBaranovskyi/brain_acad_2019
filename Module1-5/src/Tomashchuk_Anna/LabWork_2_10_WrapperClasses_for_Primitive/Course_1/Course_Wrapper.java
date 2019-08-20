package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Course_1;

public class Course_Wrapper {
    public static void main(String[] args) {
        Double doubleObject1=new Double(5.0);
        System.out.println(doubleObject1);

        Double doubleObject2=new Double("5.0");
        System.out.println(doubleObject2);

        Double doubleObject3=Double.valueOf("12.4");
        System.out.println(doubleObject3);

        Integer intObject1=new Integer(5);
        System.out.println(intObject1);

        Integer intObject2=new Integer("5");
        System.out.println(intObject2);

        Integer intObject3=Integer.valueOf("12");
        System.out.println(intObject3);

    }
}
