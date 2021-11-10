package com.company.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        fillingTheArray(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println("Array is sorted -> " + isSortedArray(mas));

    }

    private static void fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9) + 1;
        }
    }

    private static boolean isSortedArray(int[] mas) {
        int number = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (number < mas[i]) {
                number = mas[i];
            } else {
                return false;
            }
        }
        return true;
    }

}
