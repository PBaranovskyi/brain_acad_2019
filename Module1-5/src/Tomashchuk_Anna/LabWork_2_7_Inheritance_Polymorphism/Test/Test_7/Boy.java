package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_7;

public class Boy {
    private int age=19;
    private String name="Michael";

    public static void main(String[] args) {
        Boy b=new Boy();
        b.toString();
    }
    public String toString(){
        return name+"is"+age+"years old";
    }
}
