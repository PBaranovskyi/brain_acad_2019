package sinitsyn_ihor.Works.additional_practice;

public class Person {
//    public String name;
//    public int age;
//    public String gender;
//    public int yearOfBirth;
//    public static Dog dog;

    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;
    private static Dog dog;

    public static Dog getDog() {
        return dog;
    }

    public static void setDog(Dog dog) {
        Person.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {
        Person newPerson = new Person();

        newPerson.name = "Vasya";
        newPerson.age = 12;
        newPerson.gender = "мужчина";
        newPerson.yearOfBirth = 1981;
//        newPerson.dog.name = "Tузик";
//        dog.age = 5;

        dog.setName("Tузик");
        dog.setAge(5);
        System.out.println("Это " + newPerson.gender + " и его зовут " + newPerson.name + ", ему " + newPerson.age + " лет, он родился в " + newPerson.yearOfBirth + " году. Вот такой вот Бенджамин Баттон в 2019м...");
//        System.out.println("У него есть собачка " + dog.name + " которой " + dog.age + " лет.");
    }
}
