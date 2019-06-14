package sinitsyn_ihor.LabWorks2_2;

public class Matrix {
    private int[][] additionOfArr;
    private int[][] multiplicationOfArr;

    public int[][] getFirstArr() {
        return firstArr;
    }

    public void setFirstArr(int[][] firstArr) {
        this.firstArr = firstArr;
    }

    public int[][] getSecondArr() {
        return secondArr;
    }

    public void setSecondArr(int[][] secondArr) {
        this.secondArr = secondArr;
    }

    private int[][] firstArr;
    private int[][] secondArr;

    public int[][] getAdditionOfArr() {
        return additionOfArr;
    }

    private void setAdditionOfArr(int[][] additionOfArr) {
        this.additionOfArr = additionOfArr;
    }

    public int[][] getMultiplicationOfArr() {
        return multiplicationOfArr;
    }

    private void setMultiplicationOfArr(int[][] miltiplicationOfArr) {
        for (int i = 0; i < firstArr.length && i < secondArr.length; i++){
            for (int j = 0; j < firstArr[i].length && j < secondArr.length; j++){
                miltiplicationOfArr[i][j] = firstArr[i][j] + secondArr[i][j];
            }
        }
        this.multiplicationOfArr = miltiplicationOfArr;
    }
}
