package com.brainacad.classes_and_instances.Computer;

import com.brainacad.classes_and_instances.Computer.Computer;

import java.util.concurrent.Callable;

public class Lab_Work_2_1 {
    static Computer[] objArr = new Computer[5];

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(objArr[i]);
        }
        System.out.println();

        Computer comp1 = new Computer("Asus", 2345, 528, 3, 256);
        Computer comp2 = new Computer("Acer", 2346, 529, 5, 512);
        Computer comp3 = new Computer("HP", 2347, 530, 2, 318);
        Computer comp4 = new Computer("Apple", 2348, 531, 4, 123);
        Computer comp5 = new Computer("Dell", 2349, 532, 2, 234);

        objArr[0] = comp1;
        objArr[1] = comp2;
        objArr[2] = comp3;
        objArr[3] = comp4;
        objArr[4] = comp5;

        for (int j = 0; j < 5; j++) {
            System.out.println("Manufacturer: " + objArr[j].getManufacturer());
            System.out.println("Serial Number: " + objArr[j].getSerialNumber());
            System.out.println("Price: " + objArr[j].getPrice());
            System.out.println("QuantityCPU: " + objArr[j].getQuantityCPU());
            System.out.println("FrequencyCPU: " + objArr[j].getFrequencyCPU());
            System.out.println();
        }

        for (Computer v : objArr) {
            System.out.print(v.getManufacturer() + ", " + v.getSerialNumber() + ", " + v.getPrice() + ", " + v.getQuantityCPU() + ", " + v.getFrequencyCPU() + ", ");
        }
    }
}
