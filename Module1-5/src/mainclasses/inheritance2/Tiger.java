package mainclasses.inheritance2;

public class Tiger extends Animal {

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
}
