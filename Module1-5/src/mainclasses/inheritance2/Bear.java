package mainclasses.inheritance2;

public class Bear extends Animal {

    public Bear(){

    }

    public Bear(String name){
        super(name);
    }

    public void fishing(){
        System.out.println("Get a fish");
        prepareFood();
    }

    @Override
    public boolean canMultiplyAlone() {
        return false;
    }

    @Override
    public Bear multiply(Animal pair) {
        if (pair instanceof Bear) {
            return new Bear("Son of " + getName());
        } else {
            System.out.println("Error: pair is not bear ");
            return null;
        }
    }
}
