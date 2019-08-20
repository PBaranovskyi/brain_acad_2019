package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.Course;

public class try_catch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int x = arr[4];
        } catch (ArrayIndexOutOfBoundsException
                e) {
            System.out.println(e);
        }
        System.out.println("Program Finish OK!");
    }
}
