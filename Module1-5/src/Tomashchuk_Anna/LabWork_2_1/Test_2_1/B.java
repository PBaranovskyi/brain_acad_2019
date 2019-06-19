package Tomashchuk_Anna.LabWork_2_1.Test_2_1;

public class B {
    private int x1; // x1=0 по дефолту , так как значение не задано

    public void setX(int x){ //b.setX(5) - из метода main, згачит сюда в x  - setX(int x) прописываем 5, тоесть переменная int x=5
        x1=x; // x1 было 0, теперь x1 переприсвоили значение 5, x1=5
    }
    public int getX(){ // из метода main System.out.println(b.getX());
        return x1; // возвращаем x1=5
    }


}
