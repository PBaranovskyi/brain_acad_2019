package mainclasses.inheritance3;

class SportCar extends Car {

    SportCar(){
        maxSpeed = 280;
    }

    public void goGo() {
        System.out.println(maxSpeed);
    }
}