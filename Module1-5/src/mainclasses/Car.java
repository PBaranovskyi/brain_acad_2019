package mainclasses;

class Car {

    private String model;
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean automatic;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        System.out.println("model variable has changed to "+ model);
        this.model = model;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1950) {
            System.out.println("Not allowed to create a car with year: " + year);
        } else {
            this.year = year;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
}
