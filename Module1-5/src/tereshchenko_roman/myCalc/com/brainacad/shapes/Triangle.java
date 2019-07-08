package tereshchenko_roman.myCalc.com.brainacad.shapes;

public class Triangle {
    double a = 1.0;
    double b = 1.0;
    double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea (){
        double p = (a + b + c)/2;
        double area = sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

}
