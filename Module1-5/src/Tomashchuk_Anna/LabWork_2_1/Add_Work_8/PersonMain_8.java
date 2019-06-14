package LabWork_2_1.Add_Work_8;

public class PersonMain_8 {
    public static void main(String[] args) {
        Person_8 obj1 = new Person_8();

        obj1.setName("Katrin");
        obj1.setAge(3);
        obj1.setGender("Female");
        obj1.setYearOfBirth(2015);

        //Dog obj2=new Dog();
        obj1.setDog();

        System.out.println("Person name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Gender: " + obj1.getGender());
        System.out.println("YearOfBirth: " + obj1.getYearOfBirth());

        System.out.println("Собака: " + obj1.getDog());
    }
}
