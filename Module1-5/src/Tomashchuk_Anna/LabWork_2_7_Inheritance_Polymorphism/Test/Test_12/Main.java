package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Test.Test_12;

public class Main {
    public static void main(String[] args) {
        Plant[] plant={new Camomile(), new Rose()};
       for(Plant p:plant){
            if(p instanceof Rose){
                ((Rose) p).prick();
                p.smell();

            }
        }
    }
}
