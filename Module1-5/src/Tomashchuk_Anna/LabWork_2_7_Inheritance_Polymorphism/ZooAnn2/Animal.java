package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.ZooAnn2;

public class Animal {
    private boolean mamal;
    private int legs;
    protected String name;
    private int age;

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

    public int getAge(){ return age; }

    public void setAge(int age){ this.age=age; }


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

    @Override
    public boolean equals(Object obj){
        if(!this.getClass().toString().equals(obj.getClass().toString())){
            return false;
        }
        Animal second=(Animal) obj;
        return this.age==second.age && this.name.equals(second.name);
    }

}
