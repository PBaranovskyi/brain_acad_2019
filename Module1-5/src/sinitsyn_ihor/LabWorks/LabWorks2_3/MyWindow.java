package sinitsyn_ihor.LabWorks.LabWorks2_3;

import java.util.Random;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;
    private String state;
    Random rand = new Random();
    private String[] colorArr = {"белое", "черное", "коричневое", "синее", "желтое", "красное"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            MyWindow newWindow = new MyWindow();
            newWindow.setWindow();
            newWindow.printFields();
        }
    }

    public void setWindow(){
        width = Math.round((rand.nextDouble()*100+20)*100.0)/100.0;
        height = Math.round((rand.nextDouble()*100+100)*100.0)/100.0;
        color = colorArr[rand.nextInt(colorArr.length)];
        numberOfGlass = rand.nextInt(4) + 1;
        isOpen = rand.nextBoolean();
    }

    public void printFields(){
        System.out.println("Окно " + this.getColor() + " по цвету " + this.getHeight() + " см в высоту и " + this.getWidth() + " см в длину имеет " + this.getNumberOfGlass() + " стекла и всегда " + this.getState());
    }

    private String getState() {
        if (isOpen){
            state = "открыто";
        }
        else {
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
