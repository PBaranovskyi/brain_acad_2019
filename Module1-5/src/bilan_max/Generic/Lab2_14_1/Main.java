package bilan_max.Generic.Lab2_14_1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String,Integer,Long> myTuple1= new MyTuple<>("3455",45689,356678899L);
        MyTuple<Double,String,String> myTuple2=new MyTuple<>(55.55,"money","456789");
        System.out.println(myTuple1.getId()+ "   " +myTuple1.getSum()+"    "+myTuple1.getNumber());
        System.out.println(myTuple2.getId()+ "   " +myTuple2.getSum()+"    "+myTuple2.getNumber());
    }
}
