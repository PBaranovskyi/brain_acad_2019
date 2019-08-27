package Tomashchuk_Anna.Lab2_13_The_Enums.Course_1;

public class Main_3 {
    public static void main(String[] args) {
        // Enum.valueOf(String) returns the Enum constant
        String str="EAST";
        MyDirection dir=MyDirection.valueOf(str);
        System.out.println("Name= "+dir.name()+",ordinal is= "+dir.ordinal());
    }
}
