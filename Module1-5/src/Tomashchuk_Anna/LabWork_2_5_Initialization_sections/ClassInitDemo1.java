package Tomashchuk_Anna.LabWork_2_5_Initialization_sections;

public class ClassInitDemo1 {
    private static int i = doInit();

    private static int doInit() {
        System.out.println("Init i value: ");
        return 123;
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        System.out.println("int: " + i);
    }
}
