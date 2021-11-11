package com.company.hw5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        fillingTheArray(mas1);
        fillingTheArray(mas2);
        System.out.println("mas 1 -> " + Arrays.toString(mas1));
        System.out.println("mas 2 -> " + Arrays.toString(mas2));
        System.out.println("Average of mas1 -> " + averageOfArray(mas1));
        System.out.println("Average of mas2 -> " + averageOfArray(mas2));
        compareTwoElements(averageOfArray(mas1), averageOfArray(mas2));

    }

    private static void fillingTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 5);
        }
    }

    private static double averageOfArray(int[] mas) {
        double sumOfElements = 0;
        for (int element : mas) {
            sumOfElements += element;
        }
        return sumOfElements / mas.length;
    }

    private static void compareTwoElements(double number1, double number2) {
        if (number1 != number2) {
            if (number1 > number2) {
                System.out.println("Max average mas1 " + number1);
            } else {
                System.out.println("Max average mas2 " + number2);
            }
        } else {
            System.out.println("Они равны!");
        }
    }
}
