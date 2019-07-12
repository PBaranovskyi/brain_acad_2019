package Tomashchuk_Anna.LabWork_2_2_Methods.Lab221;

public class Matrix {

    private int[][] addition;
    private int[][] multiply;

    public int[][] add(Matrix obj) {
        int[][] incomeMatrix = obj.getInnitial();

        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = addition[i][j] + incomeMatrix[i][j];
            }
        }
        return sum;
    }

    public void setInnitial(int[][] addition) {
        this.addition = addition;
    }

    public int[][] getInnitial() {
        return addition;
    }


    //  multiplication Можно назвать по-другому это просто переменная
    public int[][] multiplication(Matrix obj) {
        int[][] incomeMatrix = obj.getMult();

        int[][] mult = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mult[i][j] = multiply[i][j] * incomeMatrix[i][j];
            }
        }
        return mult;
    }

    public void setMult(int[][] multiply) {
        this.multiply = multiply;
    }

    public int[][] getMult() {
        return multiply;
    }

}
