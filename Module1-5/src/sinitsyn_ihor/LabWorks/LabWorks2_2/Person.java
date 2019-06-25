package sinitsyn_ihor.LabWorks.LabWorks2_2;

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;
    private int oper;
    String[] gend = {"мужчина", "не мужчина"};
    String[] firstN = {"Иван", "Петр", "Николай", "Андрей", "Александр"};
    String[] lastN = {"Иванон", "Петров", "Сидоров", "Шевченко", "Петренко"};
    int[] operators = {50, 95, 97, 68, 93, 63};

    public String getFirstName() {
        return firstName;
    }

    public void setPerson() {
        Random rand = new Random();
        this.firstName = firstN[rand.nextInt(firstN.length)];
        this.lastName = lastN[rand.nextInt(lastN.length)];
        this.age = (int) (Math.random() * 60 + 18);
        this.gender = gend[rand.nextInt(gend.length)];
        this.oper = operators[rand.nextInt(operators.length)];
        this.phoneNumber = rand.nextInt(8999999) + 999999;
    }

    public void personToPrint() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getGender() + " " + getAge() + " лет, телефон: " + "(0" + this.oper + ")" + getPhoneNumber());
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
