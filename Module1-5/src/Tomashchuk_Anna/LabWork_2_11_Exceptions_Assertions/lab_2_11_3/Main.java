package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_3;

public class Main {
    public static void main(String[] args) {
        try {
            Person per_1 = new Person();
            per_1.setAge(45);

            Person per_2 = new Person();
            per_2.setAge(121); // InvalidAgeException

        } catch (RuntimeException exp) {
            exp.printStackTrace();
        }
    }
}
