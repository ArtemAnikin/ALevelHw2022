package com.company.moduleHw8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = createTheArray();
        fillingTheArray(array);
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(Sort.maxSort(array)));
    }

    public static int[] createTheArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array dimension-> ");
        int arrayDimension = scanner.nextInt();

        while (arrayDimension < 10) {
            System.out.print("Enter number more then '9' -> ");
            arrayDimension = scanner.nextInt();
        }
        return new int[arrayDimension];
    }

    public static void fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 200) - 100);
        }
    }


}
