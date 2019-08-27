package Tomashchuk_Anna.Lab2_13_The_Enums.Course_1;

public class Main_4_Ravno {
    public static void main(String[] args) {
        MyDirection myDir1 = MyDirection.EAST;
        MyDirection myDir2 = MyDirection.EAST;
        MyDirection myDir3 = MyDirection.SOUTH;
        System.out.println(myDir1 == myDir2); // true
        System.out.println(myDir1 == myDir3); // false

    }
}
