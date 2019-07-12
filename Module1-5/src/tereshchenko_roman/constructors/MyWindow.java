package tereshchenko_roman.constructors;

public class MyWindow {

    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

public void printFields(){
    System.out.print(width + " " + height + " " + numberOfGlass + " " + color + " " + isOpen);
    System.out.println();
}

    public MyWindow(){
    }

    public MyWindow (double width, double height){
        this(width, height, 2, "green", false);
    }


    public MyWindow (double width, double height, int numberOfGlass){
        this(width, height, numberOfGlass, "grey", true);
    }





    }

