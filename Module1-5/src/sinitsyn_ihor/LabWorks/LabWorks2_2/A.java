package sinitsyn_ihor.LabWorks.LabWorks2_2;

public class A {
    private int side;
    private int rectangleSq;
    private int squareSq;
    private int fourSq;

    public void test(int side) {
//        side = (int) (Math.random() * 100 + 2);
        int p = side * 3 / 2;
        this.rectangleSq = (int) Math.sqrt(p * Math.pow((p - side), 3));
        this.squareSq = (int) Math.pow(side, 2);
        this.fourSq = side * (side + side);
        this.side = side;
    }

    public void test() {
        System.out.println("Площадь равностороннего треугольника со стороной " + getSide() + " см равна " + getRectangleSq() + " см");
        System.out.println("Площадь квадрата со стороной " + getSide() + " см равна " + getSquareSq() + " см");
        System.out.println("Площадь прямоугольника со стороной " + getSide() + " см и стороной " + (getSide() * 2) + " см равна " + getFourSq() + " см");
    }

    public int getSide() {
        return side;
    }

    public int getRectangleSq() {
        return rectangleSq;
    }

    public int getSquareSq() {
        return squareSq;
    }

    public int getFourSq() {
        return fourSq;
    }
}
