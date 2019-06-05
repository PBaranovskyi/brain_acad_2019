package tomashchuk.anna.LabWork_1_6;

import java.util.Arrays;

public class LabWork_1_6_4 {
    public static void main(String[] args) {
        //initializing - инициализируем неотсортированный массив
        int intArr[] = {55, 57, 61, 66, 18, 19, 27, 38, 10, 11, 15, 39, 51, 82, 83, 95};
        // unsorting array - выводим массив в том виде в котором он записан, не сортируем его
        System.out.println("The unsorted int array is:");
        System.out.println(Arrays.toString(intArr));

        // sorting array
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));

        // пишем значение, которое мы ищем
        int searchVal = 57;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element 57 is: " + retVal);


    }
}
