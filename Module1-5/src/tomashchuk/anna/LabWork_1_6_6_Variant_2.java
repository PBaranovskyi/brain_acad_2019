package tomashchuk.anna;

import java.util.Arrays;

public class LabWork_1_6_6_Variant_2 {
    public static void main(String[] args) {
        //initializing - инициализируем неотсортированный массив
        int intArr[] = {-10, -7, 4, 8, 15, 27, 25, 16, 12, 9, 0, -5};
        // unsorting array - выводим массив в том виде в котором он записан, не сортируем его
        System.out.println("Average temperature values by months of 2015::");
        System.out.println(Arrays.toString(intArr));
        System.out.println();
        // sorting array
        Arrays.sort(intArr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(intArr));
    }
}
