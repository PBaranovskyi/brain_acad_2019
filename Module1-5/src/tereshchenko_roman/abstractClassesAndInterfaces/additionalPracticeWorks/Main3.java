package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class Main3 {

    public static void main(String[] args) {

        ChessPlayer player1 = new ChessPlayer("1");
        ChessPlayer player2 = new ChessPlayer("2");
        ChessPlayer player3 = new ChessPlayer("3");
        ChessPlayer player4 = new ChessPlayer("4");
        ChessPlayer player5 = new ChessPlayer("5");

        ChessTeam chessTeam1 = new ChessTeam(new ChessPlayer[] {player1, player2, player3, player4, player5});

        for (int i = 0; i < chessTeam1.getSportsmen().length; i++) {
            System.out.println("Я игрок команды chessTeam1, и мой номер " + chessTeam1.getSportsmen()[i].getName());
        }
    }
}
