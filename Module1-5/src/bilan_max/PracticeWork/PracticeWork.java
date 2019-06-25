package bilan_max.Lab2_1.PracticeWork;

public class PracticeWork {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Тузик");
        dog.setAge(5);
        Person p1 = new Person();
        p1.setName("Vasya");
        p1.setAge(12);
        p1.setGender("Male");
        p1.setyearOfBirth(1981);
        System.out.println("Имя собаки   :" + dog.getName());
        System.out.println("Возраст собаки  :" + dog.getAge() + " лет");
        System.out.println("Имя человека  :" + p1.getName() + "   Возраст :" + p1.getAge()+"лет" + "   Пол: " + p1.getGender() + "   Дата рождения :" + p1.getYearOfBirth());
    }
}
