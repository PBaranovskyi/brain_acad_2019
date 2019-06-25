package LabWork_1_6.Home_Work;

public class LabWork_1_6_3_Better_Var {
    public static void main(String[] args) {
        int[][] array=new int[4][4];
        int g=1;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=g++;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
