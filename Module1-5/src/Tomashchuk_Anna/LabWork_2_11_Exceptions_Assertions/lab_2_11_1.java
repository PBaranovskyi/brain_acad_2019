package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions;

public class lab_2_11_1 {
    public static void main(String[] args) {
        try {
            // Give the constructor for Exception a String argument
            throw new Exception("Demo exception");
        }
        catch (Exception exp) {
            System.out.println(exp);
        }
        finally {
            System.out.println("Run block finally");
        }
    }
}
