package mainclasses;

public class UseCar {

        public static void main (String[] args){
            Car car1 = new Car();
            car1.setModel("Opel Astra");
//        car1.setYear(1010);

            Car car2 = new Car();
            car2.setMaxSpeed(500);

            System.out.println(car1.getModel());
            System.out.println("year : " + getValue(car1));
        }

        private static int getValue (Car opelAstra){
            return opelAstra.getYear() / 0;
        }
    }
