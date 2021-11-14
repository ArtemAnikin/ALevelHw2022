package com.company.moduleHw8;


import java.util.Arrays;

public class WorkWithArray {
    public static void printTheArray(int[] mas) {
        System.out.println(Arrays.toString(mas));
    }

    public static void fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 200) - 100);
        }
    }

    public static int[] maxSort(int[] mas) {
        int[] newArray = Arrays.copyOf(mas, mas.length);
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    int tmp = newArray[i + 1];
                    newArray[i + 1] = newArray[i];
                    newArray[i] = tmp;
                    needSort = true;
                }
            }
        }
        return newArray;
    }

    public static int[] minSort(int[] mas) {
        int[] newArray = Arrays.copyOf(mas, mas.length);
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    int tmp = newArray[i + 1];
                    newArray[i + 1] = newArray[i];
                    newArray[i] = tmp;
                    needSort = true;
                }
            }
        }
        return newArray;
    }

    public static int[] cubEveryThirdNumber(int[] mas) {
        int[] newArray = Arrays.copyOf(mas, mas.length);
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = i % 3 == 0 ? (int) Math.pow(mas[i], 3) : mas[i];
        }
        return newArray;
    }
}
