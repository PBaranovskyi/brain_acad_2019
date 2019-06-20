package sinitsyn_ihor.LabWorks.LabWorks2_3;

import java.util.Random;

public class MyWindow {
    private double width = 40.0;
    private double height = 120.0;
    private int numberOfGlass = 2;
    private String color = "белое";
    private boolean isOpen = true;
    private String state;
    Random rand = new Random();
    private String[] colorArr = {"белое", "черное", "коричневое", "синее", "желтое", "красное"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyWindow newWindow = new MyWindow();
            newWindow.setWindow();
            newWindow.printFields();
        }

        System.out.println();
        MyWindow wind2 = new MyWindow();
        wind2.printFields();

        System.out.println();
        MyWindow wind3 = new MyWindow(33, 55);
        wind3.printFields();

        System.out.println();
        MyWindow wind4 = new MyWindow(77, 99, 32);
        wind4.printFields();
    }

    public MyWindow() {
        this(35, 111);
    }

    public MyWindow(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(int width, int height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public void setWindow() {
        width = Math.round((rand.nextDouble() * 100 + 20) * 100.0) / 100.0;
        height = Math.round((rand.nextDouble() * 100 + 100) * 100.0) / 100.0;
        color = colorArr[rand.nextInt(colorArr.length)];
        numberOfGlass = rand.nextInt(4) + 1;
        isOpen = rand.nextBoolean();
    }

    public void printFields() {
        System.out.println("Окно " + this.getColor() + " по цвету " + this.getHeight() + " см в высоту и " + this.getWidth() + " см в ширину, имеет " + this.getNumberOfGlass() + " стекла и всегда " + this.getState());
    }

    private String getState() {
        if (isOpen) {
            state = "открыто";
        } else {
            state = "закрыто";
        }
        return state;
    }

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

    public boolean isOpen() {
        return isOpen;
    }
}
