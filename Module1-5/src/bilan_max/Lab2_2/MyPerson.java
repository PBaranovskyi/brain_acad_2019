package bilan_max.Lab2_2;

public class MyPerson {
    public void personIdentity(String firstName, String lastName, String gender) {
        System.out.println("Имя: " + firstName + "   Фамилия: " + lastName);
        System.out.println("Пол: " + gender);
    }

    public void personIdentity(int age, long phoneNumber) {
        System.out.println("Возраст:" + age + "   номер телефона :"+"+" + phoneNumber);
    }
}

