package tomashchuk.anna.LabWork_1_6.Home_Work;

import java.util.Arrays;

public class Home_Work_7_swap_in_2_iterations {
    public static void main(String[] args) {
        //swap_in_2_iterations
  int[] arr={1,2,3,4,5,6,7,8,9,10};
  int b=arr[0];
  int j=9;
  for(int i=0;i<2;i++){
      arr[i]=arr[j];
      arr[j]=b;
      j--;
      b++;
  }
        System.out.println(Arrays.toString(arr));
    }
}
