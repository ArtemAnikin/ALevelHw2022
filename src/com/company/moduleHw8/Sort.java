package com.company.moduleHw8;


import java.util.Arrays;

public class Sort {
    public static int[] maxSort(int[] mas) {
        int[] newArray = Arrays.copyOf(mas,mas.length);
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

    public static void minSort(int[] mas) {

    }

}
