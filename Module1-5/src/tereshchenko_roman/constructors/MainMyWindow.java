package tereshchenko_roman.constructors;

import tereshchenko_roman.constructors.MyWindow;

public class MainMyWindow {
    public static void main(String[] args) {



    }

        MyWindow window1 = new MyWindow(32.15, 33.18, 3, "white", true);
        MyWindow window2 = new MyWindow(33.15, 37.18, 2, "white", false);
        MyWindow window3 = new MyWindow(34.15, 38.18, 3, "white", true);
        MyWindow window4 = new MyWindow(35.15, 39.18, 2, "white", false);
        MyWindow window5 = new MyWindow(36.15, 40.18, 3, "white", true);

        public void printFields () {

            MyWindow[] arr = new MyWindow[5];

            arr[0] = window1;
            arr[1] = window2;
            arr[2] = window3;
            arr[3] = window4;
            arr[4] = window5;

            for (int i = 0; i < 5; i++) {
                System.out.println("Width: " + arr[i].getWidth());
                System.out.println("Height: " + arr[i].getHeight());
                System.out.println("Number of glasses: " + arr[i].getNumberOfGlass());
                System.out.println("Color: " + arr[i].getColor());
                System.out.println("Opens: " + arr[i].getIsOpen());
                System.out.println();

            }
            return;
        }
    }




