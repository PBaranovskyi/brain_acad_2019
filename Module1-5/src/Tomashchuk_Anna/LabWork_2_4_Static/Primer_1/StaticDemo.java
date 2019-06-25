package Tomashchuk_Anna.LabWork_2_4_Static.Primer_1;

public class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y; // статическая переменная

    // Возврат суммы значений переменной экземпляра x и статической переменной y
    int sum(){
        return x+y;
    }
}
