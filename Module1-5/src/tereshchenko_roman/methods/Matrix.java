package tereshchenko_roman.methods;

public class Matrix {
    public int[][] getInnitial() {
        return innitial;
    }

    private int[][] innitial;


//    public int[][] add() {
//        int[][] sum = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = innitial[i][j] + arr2[i][j];
//            }
//        }
//        return sum;
//    }

    public int[][] add(Matrix obj) {
        int[][] incomeMatrix = obj.getInnitial();
//        int maxHeight = Math.max(innitial.length, incomeMatrix.length);
//        int maxWidth = Math.max(innitial[0].length, incomeMatrix[0].length);

        int[][] sum  = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = innitial[i][j] + incomeMatrix[i][j];
            }
        }
        return sum;
    }
//
//    public int[][] mult() {
//        int[][] prod = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                prod[i][j] = innitial[i][j] * arr2[i][j];
//            }
//        }
//        return prod;
//    }

    public void setInnitial(int[][] innitial) {
        this.innitial = innitial;
    }
}
