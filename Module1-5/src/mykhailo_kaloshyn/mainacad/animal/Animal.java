package mykhailo_kaloshyn.mainacad.animal;

public class Animal {
    private boolean mamal;
    private int paws;
    private String name = "mamal";

    public boolean isMamal() {
        return mamal;
    }

    public void setMamal(boolean mamal) {
        this.mamal = mamal;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
