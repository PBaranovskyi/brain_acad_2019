package Tomashchuk_Anna.LabWork_2_10_WrapperClasses_for_Primitive.Course_1;

public class Course_Wrapper_2 {
    public static void main(String[] args) {
        Integer intObject=5;
        int x1=intObject;
        int x2=intObject+7;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println();

        // Эквивалентная запись, это одно и тоже
        Integer intObject1=Integer.valueOf(5);
        int x3=intObject1.intValue();
        int x4=intObject1.intValue()+7;
        System.out.println(x3);
        System.out.println(x4);





    }
}
