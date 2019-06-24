package Tomashchuk_Anna.LabWork_2_3.Lab231;

public class MyWindow {
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;
   // public boolean open;

    public void setNumberOfGlass(int numberOfGlass){
        if (numberOfGlass>3) {
            System.out.println("Not allowed to create a window with numberOfGlass: "+ numberOfGlass);
        }
        else{
            this.numberOfGlass=numberOfGlass;
        }
    }

    public int getNumberOfGlass() {return numberOfGlass;}

    // Это конструктор класса MyWindow
   public MyWindow( String c,double w, double h ) {
        color=c;
        width=w;
        height=h;
    }

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

    public void printFields(double width, double height) {
        System.out.println(width+height);
    }


}
