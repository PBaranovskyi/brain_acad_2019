package Tomashchuk_Anna.LabWork_2_8_Abstract_classes_Interfaces.Book2_Interface;

public class ByTwos implements Series{ // реализация интерфейса Series
    int start;
    int val;

    ByTwos(){
        start=0;
        val=0;
    }

    public int getNext(){
        val+=2;
        return val;
    }

    public void reset(){
        start=0;
        val=0;
    }

    public void setStart(int x){
        start=x;
        val=x;
    }

}
