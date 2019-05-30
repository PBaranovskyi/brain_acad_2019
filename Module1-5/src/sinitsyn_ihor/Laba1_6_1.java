package sinitsyn_ihor;

public class Laba1_6_1 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int iterative = 1; iterative <= myArray.length; iterative++) {
            int num = iterative-1;
            myArray[num] = iterative + iterative;
            System.out.println("array[" + num + "] = " + myArray[num]);
        }
    }
}

//Array with random values from 1 to 100
//    public static void main(String[] args) {
//        int[] myArray = new int[100];
//Create new array with indexes from 0 to 99
//        for (int iterative = 0; iterative < myArray.length; iterative++) {
//            for (int element : myArray) {
//                int number = (int) Math.floor(Math.random()*100);
//                myArray[iterative] = number;
//Generate a random value and assign it to the current index
//            }
//            System.out.println("Index " + iterative + " = " + myArray[iterative]);
//        }
//    }
//}