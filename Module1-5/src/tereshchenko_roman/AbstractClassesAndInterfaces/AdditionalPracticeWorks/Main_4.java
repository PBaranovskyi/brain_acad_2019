package tereshchenko_roman.AbstractClassesAndInterfaces.AdditionalPracticeWorks;

public class Main_4 {

    public static void main(String[] args) {


        FootballPlayer player0 = new FootballPlayer("FP0");
        FootballPlayer player1 = new FootballPlayer("FP1");
        FootballPlayer player2 = new FootballPlayer("FP2");
        FootballPlayer player3 = new FootballPlayer("FP3");
        FootballPlayer player4 = new FootballPlayer("FP4");
        FootballPlayer player5 = new FootballPlayer("FP5");
        FootballPlayer player6 = new FootballPlayer("FP6");
        FootballPlayer player7 = new FootballPlayer("FP7");
        FootballPlayer player8 = new FootballPlayer("FP8");
        FootballPlayer player9 = new FootballPlayer("FP9");

        FootballTeam team1 = new FootballTeam(new FootballPlayer[]{player0, player1, player2, player3, player4, player5, player6, player7, player8, player9});

        for (int i = 0; i < team1.getSportsmen().length; i++) {

            System.out.println(team1.getSportsmen()[i].getName());

        }


        FootballPlayer player11 = new FootballPlayer("FP11");
        FootballPlayer player12 = new FootballPlayer("FP12");
        FootballPlayer player13 = new FootballPlayer("FP13");
        FootballPlayer player14 = new FootballPlayer("FP14");
        FootballPlayer player15 = new FootballPlayer("FP15");
        FootballPlayer player16 = new FootballPlayer("FP16");
        FootballPlayer player17 = new FootballPlayer("FP17");
        FootballPlayer player18 = new FootballPlayer("FP18");
        FootballPlayer player19 = new FootballPlayer("FP19");
        FootballPlayer player20 = new FootballPlayer("FP20");


        FootballTeam team2 = new FootballTeam(new FootballPlayer[]{player11, player12, player13, player14, player15, player16, player17, player18, player19, player20});

        FootballPlayer player21 = new FootballPlayer("FP11");
        FootballPlayer player22 = new FootballPlayer("FP12");
        FootballPlayer player23 = new FootballPlayer("FP13");
        FootballPlayer player24 = new FootballPlayer("FP14");
        FootballPlayer player25 = new FootballPlayer("FP15");
        FootballPlayer player26 = new FootballPlayer("FP16");
        FootballPlayer player27 = new FootballPlayer("FP17");
        FootballPlayer player28 = new FootballPlayer("FP18");
        FootballPlayer player29 = new FootballPlayer("FP19");
        FootballPlayer player30 = new FootballPlayer("FP20");

        FootballTeam team3 = new FootballTeam(new FootballPlayer[]{player21, player22, player23, player24, player25, player26, player27, player28, player29, player30});

    }
}