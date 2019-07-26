package mainclasses.inheritence4;

import java.util.Date;

public class RetroCar extends Car implements Cloneable {

    private String name;
    private Date date;

    public RetroCar(int maxSpeed, String name) {
        super(maxSpeed);
        this.name = name;
    }


    void fix() {
        System.out.println("fixed");
    }

    public String getName() {
        return name;
    }

    @Override
    public RetroCar clone() throws CloneNotSupportedException {

        RetroCar clone = (RetroCar) super.clone();
        return clone;
    }
}
