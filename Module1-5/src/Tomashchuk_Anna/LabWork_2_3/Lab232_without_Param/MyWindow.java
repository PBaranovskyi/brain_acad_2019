package Tomashchuk_Anna.LabWork_2_3.Lab232_without_Param;

public class MyWindow {
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;
    public boolean open;

    private void setNumberOfGlass(int numberOfGlass){
        if (numberOfGlass>3) {
            System.out.println("Not allowed to create a window with numberOfGlass: "+ numberOfGlass);
        }
        else{
            this.numberOfGlass=numberOfGlass;
        }
    }

    public int getNumberOfGlass() {return numberOfGlass;}

    // Это конструктор класса MyWindow
   public MyWindow() {
        color="White";
        width=2.7;
        height=3.0;
    }

    // Определение размера окна
    double size() {
        return width*height;
    }

    public void setOpen(boolean open) {this.open = open;}
    public boolean getOpen() { return open;}

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
