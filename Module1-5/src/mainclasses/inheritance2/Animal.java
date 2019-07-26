package mainclasses.inheritance2;

public abstract class Animal {
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

    public abstract Animal multiply(Animal animal);


    public abstract boolean canMultiplyAlone();

    @Override
    public String toString() {
        return " name: " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (isMamal() != animal.isMamal()) return false;
        if (getLegs() != animal.getLegs()) return false;
        return getName() != null ? getName().equals(animal.getName()) : animal.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = (isMamal() ? 1 : 0);
        result = 31 * result + getLegs();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
