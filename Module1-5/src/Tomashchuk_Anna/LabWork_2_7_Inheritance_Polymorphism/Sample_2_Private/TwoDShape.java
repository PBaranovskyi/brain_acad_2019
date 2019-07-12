package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Sample_2_Private;

// Закрытые члены класса не наследуются
// Этот код не пройдет компиляцию
public class TwoDShape {
    // private double width; // теперь эти переменные объявлены как закрытые
    // private double heigth; // Этот код не пройдет компиляцию потому что private

    public double width;
    public double heigth;

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + heigth);
    }

}
