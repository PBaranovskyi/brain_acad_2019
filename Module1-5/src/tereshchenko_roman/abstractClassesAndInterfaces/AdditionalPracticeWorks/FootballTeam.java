package tereshchenko_roman.abstractClassesAndInterfaces.AdditionalPracticeWorks;

public class FootballTeam implements Team {

    private FootballPlayer[] team;

    public FootballTeam(FootballPlayer[] team){
        this.team = team;
    }

    @Override
    public Sportsman[] getSportsmen() {
        return team;
    }
}
