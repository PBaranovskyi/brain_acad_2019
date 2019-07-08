package mykhailo_kaloshyn.mainacad.lab2_3;

public class MyWindow {

    private double width ;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;


    public MyWindow() {
        System.out.println("constructor");
    }


    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height) {
        this(width, height, 3, "white", true);
       /* this.width = width;
        this.height = height;
        this.numberOfGlass = 3;
        this.color = "white";
        this.isOpen = true;*/
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "white", true);
       /* this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = "white";
        this.isOpen = true;*/
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    {
        System.out.println("init -block");
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public static void printFields(MyWindow window) {
        System.out.print("width: " + window.width + "; height: " + window.height + "; number of glasses: " + window.numberOfGlass + "; color: " + window.color + "; the window is opened: " + window.isOpen);
        System.out.println();
    }
}
