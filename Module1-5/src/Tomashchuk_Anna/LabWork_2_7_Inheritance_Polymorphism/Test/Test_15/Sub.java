package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_15;

public class Sub extends Base {
    public String name="Sub";
    public String getName(){return name;}

    public static void main(String[] args) {
        Sub s= new Sub();
        Base b=s;
        System.out.println(s.getName()+" "+b.getName());
    }
}
