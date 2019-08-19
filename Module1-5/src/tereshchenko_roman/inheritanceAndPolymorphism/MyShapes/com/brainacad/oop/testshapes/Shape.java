package tereshchenko_roman.inheritanceAndPolymorphism.MyShapes.com.brainacad.oop.testshapes;

public abstract class Shape implements Drawable {

    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    private int shapeCode;

    public int getShapeCode() {
        return shapeCode;
    }

    public Shape(int shapeCode) {
        this.shapeCode = shapeCode;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    //Wraper classes

    public static Shape parseShape(String s){



        return null;
    }

}
