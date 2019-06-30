package tereshchenko_roman.constructors;

public class MyWindow {

    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(){
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    MyWindow window1 = new MyWindow(35.2, 15.1, 2, "white", true);

//
//    //     Lab Work 2_3_2
//    public MyWindow() {
////        this.width = width;
////        this.height = height;
//    }
//
//    //    Lab Work 2_3_3
//    public MyWindow(double width, double height) {
//    }
//
//    public MyWindow(double width, double height, int numberOfGlass) {
//    }
//
////    Lab Work 2_3_4
////    public MyWindow(double width, double height, int numberOfGlass){
////        this.width = width;
////        this.height = height;
////        this.numberOfGlass = numberOfGlass;
//
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }
//
//
//
//    MyWindow window1 = new MyWindow;
//    };
//    MyWindow window2;
//    MyWindow window3;
//    MyWindow window4;
//    MyWindow window5;

    public void printFields(MyWindow[] arr) {

        ;

    }




    }

//    public void printFields(double v, double v1, int i, String white, boolean b) {
//
//    }
//}
