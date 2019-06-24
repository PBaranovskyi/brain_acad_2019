package sinitsyn_ihor.LabWorks.LabWorks2_4;

import java.util.Random;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private int phoneNumb;
    static int numberOfEmployees = 0;
    private String[] names = {"Юлия", "Сергей", "Екатерина", "Павел", "Арсений", "Диана"};
    private String[] surnames = {"Петренко", "Сидоренко", "Иваненко", "Паненко", "Савельенко", "Кошевня"};
    private String[] vacancy = {"менеджер", "администратор", "инженер", "юрист", "бухгалтер", "секретарь"};
    private String[] operators = {"+38(050)", "+38(095)", "+38(067)", "+38(068)", "+38(063)", "+38(093)"};
    Random rand = new Random();

    public void setEmployees(int numb) {
        for (int i = 0; i < numb; i++) {
            this.firstName = names[rand.nextInt(names.length)];
            this.lastName = surnames[rand.nextInt(surnames.length)];
            this.occupation = vacancy[rand.nextInt(vacancy.length)];
            this.phoneNumb = rand.nextInt(8_999_999) + 1_000_000;
            numberOfEmployees++;
            this.toPrint();
        }
        System.out.println("Количество сотрудников: " + getNumberOfEmployees());
    }

    public void toPrint() {
        System.out.println(getFirstName() + " " + getLastName() + ", " + getOccupation() + ", телефон: " + operators[rand.nextInt(operators.length)] + getPhoneNumb());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}