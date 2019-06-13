package LabWork_2_1.Add_Work_2;

public class DogTestDrive_2 {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Dog obj2 = new Dog();

        obj1.setName("Тузик");
        obj2.setAge(5);

        System.out.println("Name of Dog: " + obj1.getName());
        System.out.println("Age: " + obj2.getAge());

    }
}
