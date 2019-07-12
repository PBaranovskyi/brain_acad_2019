package tereshchenko_roman.constructors;

import tereshchenko_roman.constructors.MyWindow;

public class MainMyWindow {
    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(33.15, 37.18, 1, "white", false);
        MyWindow window2 = new MyWindow(33.15, 47.18, 2, "yellow", false);
        MyWindow window3 = new MyWindow(34.15, 38.18, 3, "blue", true);
        MyWindow window4 = new MyWindow(35.15, 39.18, 4, "red", false);
        MyWindow window5 = new MyWindow(36.15, 40.18, 3, "green", true);
        MyWindow window6 = new MyWindow();
        MyWindow window7 = new MyWindow(20, 50);
        MyWindow window8 = new MyWindow(100, 200, 2);

        window1.printFields();
        window2.printFields();
        window3.printFields();
        window4.printFields();
        window5.printFields();
        window6.printFields();
        window7.printFields();
        window8.printFields();


    }
}






