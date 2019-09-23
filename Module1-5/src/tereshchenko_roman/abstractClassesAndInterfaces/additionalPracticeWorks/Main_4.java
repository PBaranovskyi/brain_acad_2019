package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class Main_4 {

    public static void main(String[] args) {

Formula1Racer formula1Racer1 = new Formula1Racer("1");
Formula1Racer formula1Racer2 = new Formula1Racer("2");
Formula1Racer formula1Racer3 = new Formula1Racer("3");
Formula1Racer formula1Racer4 = new Formula1Racer("4");
Formula1Racer formula1Racer5 = new Formula1Racer("5");

Formula1Team formula1Team1 = new Formula1Team(new Formula1Racer[] {formula1Racer1, formula1Racer2, formula1Racer3, formula1Racer4, formula1Racer5});

        for (int i = 0; i < formula1Team1.getSportsmen().length; i++) {
            System.out.println("Я игрок команды formula1Team1, и мой номер " + formula1Team1.getSportsmen()[i].getName());
        }

    }
}