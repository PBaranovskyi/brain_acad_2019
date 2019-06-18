package mykhailo_kaloshyn.mainacad.lab2_3;

import static mykhailo_kaloshyn.mainacad.lab2_3.MyWindow.printFields;

public class MyWindowObjects {
    public static void main(String[] args) {

        MyWindow[] arrWindows = new MyWindow[8];

        arrWindows[0] = new MyWindow(60, 110, 2, "brown", false);
        arrWindows[1] = new MyWindow(60, 130.5, 3, "white", true);
        arrWindows[2] = new MyWindow(80, 152, 3, "white", true);
        arrWindows[3] = new MyWindow(100, 100, 2, "brown", false);
        arrWindows[4] = new MyWindow(82.3, 42.6, 3, "creme", true);
        arrWindows[5] = new MyWindow();
        arrWindows[6] = new MyWindow(120, 140);
        arrWindows[7] = new MyWindow(120, 140.5, 2);

        for (int i = 0; i < arrWindows.length; i++) {
            System.out.print("The window" + (i + 1) + " has the following arguments: ");
            printFields(arrWindows[i]);
        }
    }
}
