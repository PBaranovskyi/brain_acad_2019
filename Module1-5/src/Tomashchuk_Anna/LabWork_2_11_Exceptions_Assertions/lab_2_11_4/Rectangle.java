package Tomashchuk_Anna.LabWork_2_11_Exceptions_Assertions.lab_2_11_4;


public class Rectangle extends Shape {
    private double width,
            height;
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    public static Rectangle parseRectangle(String value) {
        String[] words = value.split("[:,]");
        return new Rectangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]));
    }
}
