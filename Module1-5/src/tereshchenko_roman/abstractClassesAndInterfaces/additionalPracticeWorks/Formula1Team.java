package tereshchenko_roman.abstractClassesAndInterfaces.additionalPracticeWorks;

public class Formula1Team implements Team {

    private Formula1Racer[] team;

    Formula1Team (Formula1Racer[] team){this.team = team;}


    @Override
    public Sportsman[] getSportsmen() {
        return team;
    }
}
