package Tomashchuk_Anna.LabWork_2_3_Constructors.Lab233_Overload_Constr;

public class MyWindow {
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;
    public boolean open;

    public void setNumberOfGlass(int numberOfGlass){
        if (numberOfGlass>3) {
            System.out.println("Not allowed to create a window with numberOfGlass: "+ numberOfGlass);
        }
        else{
            this.numberOfGlass=numberOfGlass;
       }
    }

   public int getNumberOfGlass() {return numberOfGlass;}

//////////////////////////// overloaded constructors
    // Это конструктор класса MyWindow

    // Конструктор без параметров
    public MyWindow() {
        color="White";
        width=2.7;
        height=3.0;
    }


    public MyWindow( double wid, double hei ) {
        width=wid;
        height=hei;
    }

    public MyWindow( double wid, double hei , int glass) {
        width=wid;
        height=hei;
        numberOfGlass=glass;
    }
     //user-defined constructor
    public MyWindow( String col,double wid, double hei ) {
        color=col;
        width=wid;
        height=hei;
    }
////////////////////////////
    // Определение размера окна
    double size() {
        return width*height;
    }

   // public void setOpen(boolean open) {this.open = open;}
   // public boolean isOpen() {     return open;}

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() { return color; }

    // Метод printFields
    public String printFields(String color, double width, double height, int numberOfGlass, boolean open) {
        System.out.println("Color: "+color+", Width: "+width+", Heigth: "+height+", NumberOfGlass: "+numberOfGlass+
                ", IsOpen: "+open);
        return color+width+height+numberOfGlass+open;
    }


}
