package sinitsyn_ihor.Works.additional_practice;

public class MainMethod {
    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.setName("Tузик");
        newDog.setAge(5);
        System.out.println("Собаку зовут " + newDog.getName() + " и ему " + newDog.getAge() + " лет.");

        Person newPerson = new Person();
        newPerson.setName("Vasya");
        newPerson.setAge(12);
        newPerson.setGender("мужчина");
        newPerson.setYearOfBirth(1981);
        System.out.println("Это " + newPerson.getGender() + " и его зовут " + newPerson.getName() + ", ему " + newPerson.getAge() + " лет, он родился в " + newPerson.getYearOfBirth() + " году. Вот такой вот Бенджамин Баттон в 2019-м...");
        System.out.println("А еще у него есть собачка " + newDog.getName() + " которой " + newDog.getAge() + " лет.");

        Bus newBus = new Bus();
        Bus nextBus = new Bus();
        newBus.setSeats(15);
        nextBus.setSeats(5);
        newBus.setDriver(newPerson);
        if (newBus.getDriver() != null) {
            newBus.setSeats(14);
            System.out.println("В автобусе " + newBus.getSeats() + " мест, водителем " + newPerson.getName() + ".");
        } else {
            System.out.println("В первом автобусе " + newBus.getSeats() + " мест, а во втором " + nextBus.getSeats() + ".");
        }
    }
}
