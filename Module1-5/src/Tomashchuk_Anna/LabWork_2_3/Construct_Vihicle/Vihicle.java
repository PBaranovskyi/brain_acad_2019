package Tomashchuk_Anna.LabWork_2_3.Construct_Vihicle;

public class Vihicle {
    int passengers;
    int fuelcap;
    int mpg;

   // Это конструктор класса Vihicle
    Vihicle(int p, int f, int m) {
        passengers=p;
        fuelcap=f;
        mpg=m;
    }

    // Определение дальности поездки
    int range() {
        return mpg*fuelcap;
    }

    //Расчет топлива
    double fuelneeded(int miles) {
        return (double) miles/mpg;
    }

}
