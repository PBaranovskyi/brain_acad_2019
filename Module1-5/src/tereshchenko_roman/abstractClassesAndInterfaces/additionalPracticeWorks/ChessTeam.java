package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class ChessTeam implements Team {

    private ChessPlayer[] team;

    public ChessTeam (ChessPlayer[] team) {this.team = team;}

    @Override
        public Sportsman[] getSportsmen() {
        return team;
    }
}
