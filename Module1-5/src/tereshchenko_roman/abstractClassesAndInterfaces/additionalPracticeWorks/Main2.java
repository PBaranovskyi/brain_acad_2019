package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class Main2 {

    public static void main(String[] args) {
        System.out.println();

        FootballPlayer player1 = new FootballPlayer("1");
        FootballPlayer player2 = new FootballPlayer("2");
        FootballPlayer player3 = new FootballPlayer("3");
        FootballPlayer player4 = new FootballPlayer("4");
        FootballPlayer player5 = new FootballPlayer("5");
        FootballPlayer player6 = new FootballPlayer("6");
        FootballPlayer player7 = new FootballPlayer("7");
        FootballPlayer player8 = new FootballPlayer("8");
        FootballPlayer player9 = new FootballPlayer("9");
        FootballPlayer player0 = new FootballPlayer("0");

        FootballTeam footballTeam1 = new FootballTeam(new FootballPlayer[]{player0,player1, player2, player3, player4, player5, player6, player7, player8, player9});

        for (int i = 0; i < footballTeam1.getSportsmen().length; i++) {
            System.out.println("Я игрок команды footbalTeam1, и мой номер " +  footballTeam1.getSportsmen()[i].getName());
        }
    }
}
