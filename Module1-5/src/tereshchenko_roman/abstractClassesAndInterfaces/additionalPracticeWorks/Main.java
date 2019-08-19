package tereshchenko_roman.AbstractClassesAndInterfaces.AdditionalPracticeWorks;

public class Main {

    public static void main(String[] args) {
        Sportsman s1 = new FootballPlayer("Вася");
        Sportsman s2 = new FootballPlayer("Петя");
        Sportsman s3 = new FootballPlayer("Саша");
        Sportsman s4 = new FootballPlayer("Сеня");
        Sportsman s5 = new FootballPlayer("Коля");

        Sportsman arr[] = {s1, s2, s3, s4, s5};


        for (Sportsman sportsman : arr) {
            System.out.println("Я " + sportsman.getName() + " играю в " + sportsman.getSport());
        }

        System.out.println();

        Sportsman s6 = new ChessPlayer("Рома");
        Sportsman s7 = new ChessPlayer("Дима");
        Sportsman s8 = new ChessPlayer("Миша");
        Sportsman s9 = new ChessPlayer("Женя");
        Sportsman s10 = new ChessPlayer("Ваня");

        Sportsman arr2[] = {s6, s7, s8, s9, s10};

        for (Sportsman sportsman : arr2) {
            System.out.println("Я " + sportsman.getName() + " играю в " + sportsman.getSport());
        }

        System.out.println();

        Sportsman s11 = new Formula1Racer("Джон");
        Sportsman s12 = new Formula1Racer("Пол");
        Sportsman s13 = new Formula1Racer("Сэм");
        Sportsman s14 = new Formula1Racer("Боб");
        Sportsman s15 = new Formula1Racer("Дик");

        Sportsman arr3[] = {s11, s12, s13, s14, s15};

        for (Sportsman sportsman : arr3) {
            System.out.println("Я " + sportsman.getName() + " играю в " + sportsman.getSport());
        }
    }

}
