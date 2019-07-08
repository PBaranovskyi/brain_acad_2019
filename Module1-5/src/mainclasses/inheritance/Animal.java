package mainclasses.inheritance;

public class Animal {
    private boolean mamal;
    private  int legs;
    private String name;

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

    public void eat(Animal animal){
        prepareFood();
        System.out.println(animal.getName() + " поел");
    }

    protected void prepareFood() {
        System.out.println("prepareFood");
    }


}
