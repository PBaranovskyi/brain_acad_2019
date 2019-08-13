package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

public class Shape {
    private double area;
    private String shapeColor;
//    private String name;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double calcArea() {
        System.out.println("Shape area is: " + area);
        return area;
    }

//    @Override
//    public String toString() {
//        System.out.println("This is " + this.getName() + ", color is " + this.getShapeColor());
//        return super.toString();
//    }
}
