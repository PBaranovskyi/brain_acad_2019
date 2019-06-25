package Tomashchuk_Anna.LabWork_2_3_Constructors.Lab234;

public class MyWindow {
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;
    public boolean open;


    // Это конструктор класса MyWindow

    public MyWindow() {
        this(2.4,4.0);
        System.out.println("This Constructor ");

    }

    public MyWindow( double wid, double hei ) {
        this.width=wid;
        this.height=hei;
    }

    public MyWindow( double wid, double hei , int glass) {
        this.width=wid;
        this.height=hei;
        this.numberOfGlass=glass;
    }


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
