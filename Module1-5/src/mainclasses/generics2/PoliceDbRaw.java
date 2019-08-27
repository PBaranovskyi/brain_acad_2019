package mainclasses.generics2;

import mainclasses.inheritence4.Car;

public class PoliceDbRaw<K, V extends Car> {

    private K key;
    private V value;

    public PoliceDbRaw(K name, V car) {
        this.key = name;
        this.value = car;
    }

    public K getKey() {
        return key;
    }

    public V getCar() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getMaxSpeed(){
        return value.getMaxSpeed();
    }
}
