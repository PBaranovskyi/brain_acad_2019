package Tomashchuk_Anna.LabWork_2_2_Methods.Sample_Multiplication;

public class Matrix {

    public int[][] getMult() {
        return multiply;
    }

    private int[][] multiply;

    //  multiplication Можно назвать по-другому это просто переменная
    public int[][] multiplication(Matrix obj) {
        int[][] incomeMatrix = obj.getMult();

       int[][] mult  = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mult[i][j] = multiply[i][j] * incomeMatrix[i][j];
            }
       }
       return mult;
    }


    public void setMult(int[][] multiply) {
        this.multiply = multiply;}


}
