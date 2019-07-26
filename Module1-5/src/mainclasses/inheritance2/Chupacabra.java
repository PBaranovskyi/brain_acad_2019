package mainclasses.inheritance2;

public class Chupacabra extends Animal {
    public Chupacabra(){

    }

    public Chupacabra(String name){
        super(name);
    }

    @Override
    public boolean canMultiplyAlone() {
        return true;
    }

    @Override
    public Chupacabra multiply(Animal pair) {
        return new Chupacabra();
    }
}
