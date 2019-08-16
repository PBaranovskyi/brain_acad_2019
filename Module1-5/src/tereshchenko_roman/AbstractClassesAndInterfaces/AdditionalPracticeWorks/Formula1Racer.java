package tereshchenko_roman.AbstractClassesAndInterfaces.AdditionalPracticeWorks;

public class Formula1Racer implements Sportsman {

    private String name;
    private String sport = "Formula1";

    public Formula1Racer (String name){
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
