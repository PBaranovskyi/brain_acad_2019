package mainclasses.inheritance2;

public class Animal {
    private boolean mamal;
    private int legs;
    protected String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public boolean isMamal() {
        return mamal;
    }

    public void setMamal(boolean mamal) {
        this.mamal = mamal;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        prepareFood();
        System.out.println(this.getName() + " поел");
    }

    protected void prepareFood() {
        System.out.println("prepareFood");
    }


    @Override
    public String toString() {
        return " name: " + getName();
    }
}
