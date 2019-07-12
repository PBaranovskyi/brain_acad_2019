package mainclasses.inheritance2;

public class Tiger extends Animal {

    private int age;
    private String color;

    public Tiger(){

    }

    public Tiger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int tailLength;

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public void may(){
        System.out.println("Tiger say mya");
    }

    @Override
    public void eat() {
        super.eat();
        may();
    }

    public int countYourLegs(){
        return getLegs();
    }

    @Override
    public boolean equals(Object obj) {

        if (!this.getClass().toString().equals(obj.getClass().toString())) {
            return false;
        }
        Tiger second = (Tiger) obj;
        return this.age == second.age && this.name.equals(second.name);
    }
}
