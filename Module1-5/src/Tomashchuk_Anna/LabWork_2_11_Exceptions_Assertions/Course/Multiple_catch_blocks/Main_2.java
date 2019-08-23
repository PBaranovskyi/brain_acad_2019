package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course.Multiple_catch_blocks;

public class Main_2 {
    public static void main(String[] args) {
        // Сначала надо ловить самые узкие Exception
        // а потом их родителей,
        // а потом остальное

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("ArithmeticException or ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
