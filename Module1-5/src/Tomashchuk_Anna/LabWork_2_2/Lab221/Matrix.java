package LabWork_2_2.Lab221;

public class Matrix {
    public int[][] getInnitial() {
        return innitial;
    }

    private int[][] innitial;

    public int[][] add(Matrix obj) {
        int[][] incomeMatrix = obj.getInnitial();

        int[][] sum  = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = innitial[i][j] + incomeMatrix[i][j];
            }
        }
        return sum;
    }


    public void setInnitial(int[][] innitial) {
        this.innitial = innitial;}

    public void add(int[][] arr1, int[][] arr2) {
    }
}
