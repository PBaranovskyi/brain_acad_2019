package sinitsyn_ihor.LabWorks.LabWorks2_6.example.applepack;

public class Apple {
    private double weight;

    {
        this.setMass();
    }

    public double getMass() {
        return weight;
    }

    public void setMass() {
        this.weight = (double) (Math.random());
    }
}
