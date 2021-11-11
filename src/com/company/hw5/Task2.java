package com.company.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[8];
        fillingTheArray(mas);
        System.out.println(Arrays.toString(mas));
        changeOddElements(mas);
        System.out.println(Arrays.toString(mas));

    }

    private static void fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9) + 1;
        }
    }

    private static void changeOddElements(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i % 2 != 0 ? 0 : mas[i];
        }
    }
}
