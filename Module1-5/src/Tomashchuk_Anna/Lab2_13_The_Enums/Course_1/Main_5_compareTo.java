package Tomashchuk_Anna.Lab2_13_The_Enums.Course_1;

public class Main_5_compareTo {
    public static void main(String[] args) {
        MyDirection myDir1 = MyDirection.EAST;
        MyDirection myDir2 = MyDirection.EAST;
        MyDirection myDir3 = MyDirection.SOUTH;
        // Сравнивает порядок
        System.out.println(myDir1.compareTo(myDir2));
        System.out.println(myDir1.compareTo(myDir3));
        System.out.println(myDir3.compareTo(myDir1));

    }
}
