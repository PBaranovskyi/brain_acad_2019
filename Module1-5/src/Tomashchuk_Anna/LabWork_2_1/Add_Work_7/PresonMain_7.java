package LabWork_2_1.Add_Work_7;

public class PresonMain_7 {
    public static void main(String[] args) {
        Person_7 adj1 = new Person_7();

        adj1.setName("Katrin");
        adj1.setAge(3);
        adj1.setGender("Female");
        adj1.setYearOfBirth(2015);

        System.out.println("Person name: " + adj1.getName());
        System.out.println("Age: " + adj1.getAge());
        System.out.println("Gender: " + adj1.getGender());
        System.out.println("YearOfBirth: " + adj1.getYearOfBirth());
    }
}

