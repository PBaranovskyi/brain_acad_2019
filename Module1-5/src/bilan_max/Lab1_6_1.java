package bilan_max;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] myList = new int[30];
        for (int i = 0; i < myList.length; i++)
            myList[i] = i+2;
            for(int j:myList){
                if(j%2==0)
                    System.out.print(j+ "  ");
            }
    }
}