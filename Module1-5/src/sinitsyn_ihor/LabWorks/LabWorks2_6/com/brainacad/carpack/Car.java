package sinitsyn_ihor.LabWorks.LabWorks2_6.com.brainacad.carpack;

public class Car {
    private double weight;

    {
        this.setMass();
    }

    public double getMass() {
        return weight;
    }

    public void setMass() {
        this.weight = (double) (10_000 * Math.random());
    }
}
