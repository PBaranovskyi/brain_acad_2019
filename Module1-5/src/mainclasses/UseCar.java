package mainclasses;

public class UseCar {



    public static void main(String[] args) {
        Car opelAstra = new Car();
        opelAstra.setModel("Opel Astra");
//        opelAstra.setYear(1010);


        System.out.println(opelAstra.getModel());
        System.out.println("year : " + getValue(opelAstra));
    }

    private static int getValue(Car opelAstra) {
        return opelAstra.getYear()/0;
    }
}
