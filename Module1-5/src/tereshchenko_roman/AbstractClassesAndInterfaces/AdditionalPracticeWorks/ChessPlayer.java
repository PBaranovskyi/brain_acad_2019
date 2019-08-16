package tereshchenko_roman.AbstractClassesAndInterfaces.AdditionalPracticeWorks;

public class ChessPlayer implements Sportsman{

    private String name;
    private String sport = "шахматы";

    public ChessPlayer (String name){
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
