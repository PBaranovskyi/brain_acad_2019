package sinitsyn_ihor;

public class Laba1_6_1 {
    public static void main(String[] args) {
        int[] myArray = new int[30/2];
        int myIndex = 0;
        for (int iterative = 2; iterative <= 30; iterative += 2) {
            myArray[myIndex] = iterative;
            System.out.println("Index: "+myIndex+".  Value: "+iterative);
            myIndex++;
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