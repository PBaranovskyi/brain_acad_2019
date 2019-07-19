package mainclasses.inheritance2;

public class Tiger extends Animal {

    private int age;
    private String color;

    private int tailLength;

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

//    @Override
//    public boolean equals(Object obj) {
//
//        if (!this.getClass().toString().equals(obj.getClass().toString())) {
//            return false;
//        }
//        Tiger second = (Tiger) obj;
//        return this.age == second.age && this.name.equals(second.name);
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Tiger tiger = (Tiger) obj;

        if (age != tiger.age) return false;
        if (getTailLength() != tiger.getTailLength()) return false;
        return getColor() != null ? getColor().equals(tiger.getColor()) : tiger.getColor() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + age;
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getTailLength();
        return result;
    }
}
