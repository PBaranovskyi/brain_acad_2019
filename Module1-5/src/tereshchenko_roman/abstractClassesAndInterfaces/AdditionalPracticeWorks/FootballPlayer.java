package tereshchenko_roman.abstractClassesAndInterfaces.AdditionalPracticeWorks;

public class FootballPlayer implements Sportsman {


    private String name;
    private String sport = "Футбол";

    public FootballPlayer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSport() {
        return this.sport;
    }

}
