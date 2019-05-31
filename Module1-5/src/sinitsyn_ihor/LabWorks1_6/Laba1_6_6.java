package sinitsyn_ihor.LabWorks1_6;

import java.util.Arrays;

public class Laba1_6_6 {
    public static void main(String[] args) {
        int[] weatherArray = {-4, -2, 4, 11, 18, 22, 24, 21, 17, 9, 5, -3};
        System.out.println("The weather during a year was: " + Arrays.toString(weatherArray));
        Arrays.sort(weatherArray);

// Сортировка выбором (Selection sort https://youtu.be/Ns4TPTC8whw ). По очереди будем просматривать все подмножества
// элементов массива (0 - последний, 1-последний, 2-последний,...)
//        for (int i = 0; i < weatherArray.length; i++) {
////        /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
////            int min = weatherArray[i];
////            int min_i = i;
////        /*В оставшейся части подмножества ищем элемент, который меньше предположенного минимума*/
////            for (int j = i+1; j < weatherArray.length; j++) {
////                //Если находим, запоминаем его индекс
////                if (weatherArray[j] < min) {
////                    min = weatherArray[j];
////                    min_i = j;
////                }
////            }
////        /*Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами*/
////            if (i != min_i) {
////                int temp = weatherArray[i];
////                weatherArray[i] = weatherArray[min_i];
////                weatherArray[min_i] = temp;
////            }
////        }

// Сортировка пузырьком (Bubble sort https://youtu.be/lyZQPjUT5B4 ). Внешний цикл каждый раз сокращает фрагмент массива,
// так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент.
//        for (int i = weatherArray.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
////Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами.
//                if (weatherArray[j] > weatherArray[j + 1]) {
//                    int temp = weatherArray[j];
//                    weatherArray[j] = weatherArray[j + 1];
//                    weatherArray[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("The weather during by year after sorting: " + Arrays.toString(weatherArray));
    }
}
