package Tomashchuk_Anna.LabWork_2_3.Lab231;

public class  MyWindowMain {
    public static void main(String[] args) {
        MyWindow myWindow=new MyWindow("White", 3.2, 0.9);

        System.out.println(myWindow.getColor());
        System.out.println(myWindow.color);
        System.out.println(myWindow.width);
        System.out.println(myWindow.height);

        //Это мы вызываем Конструктор
        System.out.println("Constructor : "+myWindow.color+" "+myWindow.width+" "+myWindow.height);

        myWindow.numberOfGlass=2; //-Почему не выводит ? Not allowed to create a window with numberOfGlass
        System.out.println("NumberOfGlass: "+myWindow.getNumberOfGlass());

        myWindow.printFields("Brown",2.8,4.2,6,true);


    }
}
