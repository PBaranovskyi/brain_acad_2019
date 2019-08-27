package Tomashchuk_Anna.Lab2_13_The_Enums.Course_1;

public class Main_2 {
    public static void main(String[] args) {
        for (MyDirection dir : MyDirection.values()) {
            // name() - String-овое отображение того что мы пишем в классе
            // ordinal() - Порядок
            System.out.println("Name " + dir.name() + ",ordinal is= " + dir.ordinal());
        }
    }
}
