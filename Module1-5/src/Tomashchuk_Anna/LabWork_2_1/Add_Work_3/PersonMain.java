package Tomashchuk_Anna.LabWork_2_1.Add_Work_3;

public class PersonMain {
    public static void main(String[] args) {
        Person one = new Person();

        one.setName("Vasya");
        one.setAge(12);
        one.setGender("M");
        one.setYearOfBirth(1981);

        System.out.println("Name of Person: " + one.getName());
        System.out.println("Age: " + one.getAge());
        System.out.println("Gender: " + one.getGender());
        System.out.println("YearOfBirth: " + one.getYearOfBirth());

    }
}
