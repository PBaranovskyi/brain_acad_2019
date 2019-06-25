package Tomashchuk_Anna.LabWork_2_3_Constructors.Lab233_Overload_Constr;

public class  MyWindowMain {
    public static void main(String[] args) {
        MyWindow myWindow=new MyWindow("White", 3.2, 0.9);
        MyWindow myWindow2=new MyWindow(2.4,4.0,7);

        System.out.println(myWindow.getColor());
        System.out.println(myWindow.color);
        System.out.println(myWindow.width);
        System.out.println(myWindow.height);

        //Это мы вызываем Конструктор
        System.out.println("Constructor : "+myWindow.color+" "+myWindow.width+" "+myWindow.height);

        myWindow.numberOfGlass=2; //-Почему не выводит ? Not allowed to create a window with numberOfGlass
        System.out.println("NumberOfGlass: "+myWindow.getNumberOfGlass());

        myWindow.printFields("Brown",2.8,4.2,6,true);

        System.out.println("Constructor_2: width:"+myWindow2.width+", heigth: "+myWindow2.height+", Window: "+ myWindow2.numberOfGlass);


    }
}
