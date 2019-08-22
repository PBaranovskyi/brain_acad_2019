package sinitsyn_ihor.LabWorks.LabWorks2_7.MyShapes;

abstract class Shape implements Drawable{
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

    public abstract double calcArea();

    @Override
    public String toString() {
        System.out.println("This is " + getClass().toString() + ", color is " + this.getShapeColor());
        return super.toString();
    }
}
