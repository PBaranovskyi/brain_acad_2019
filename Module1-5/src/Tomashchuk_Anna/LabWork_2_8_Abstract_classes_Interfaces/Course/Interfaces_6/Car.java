package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Course.Interfaces_6;

public class Car implements OperateCar {
    //implements - Обеспечивает выполнение, принадлежит
    @Override
    public void signalTurn() {
        System.out.println("signalTurn");
    }
}
