package Tomashchuk_Anna.LabWork_2_7_Inheritance_Polymorphism.Arraycopy;

import java.util.Arrays;

// копирование элементов из одного массива в другой
public class Arraycopy {
    public static void main(String[] args) {
        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // откуда копируем
        int[] destArr = new int[5]; // куда копируем -пустой массив из 5 элементов [0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(sourceArr));
        System.out.println(Arrays.toString(destArr));

        // Параметр_1 является массив-источник- sourceArr
        // Параметр_2 является позиция начала нового массива - srcPos=5
        // Параметр_3 - массив-назначения - destArr
        // Параметр_4- является начальным положением целевого массива destPos=0
        // Параметр_5 -  это количество элементов, которые будут скопированы

        //Вот код, чтобы скопировать последние пять элементов исходного массива в конечный массив (массив-назначения):
        System.arraycopy(sourceArr, 5, destArr, 0, 5);
        for (int i = 0; i < destArr.length; i++) {
            System.out.print(destArr[i] + " ");
        }

    }

}
