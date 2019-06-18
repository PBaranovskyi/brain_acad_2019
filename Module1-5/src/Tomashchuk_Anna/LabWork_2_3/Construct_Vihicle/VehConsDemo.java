package Tomashchuk_Anna.LabWork_2_3.Construct_Vihicle;

public class VehConsDemo {
    public static void main(String[] args) {
        //завершение создания объектов
       Vihicle minivan=new Vihicle(7,16,21);
       Vihicle sportcar=new Vihicle(2,14,12);
       double gallons;
       int dist=252;

       gallons=minivan.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+" миль мини-фургону требуется "+
                + gallons+" галлонов топлива");

        gallons=sportcar.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+" спорт-авто "+
                + gallons+" галлонов топлива");

    }
}
