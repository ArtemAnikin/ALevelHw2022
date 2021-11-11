package com.company.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = new int[12];
        fillingAndPrintTheArray(mas);
        findMaxElementAndIndex(mas);
    }

    private static void fillingAndPrintTheArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 30) - 15;
            System.out.print(mas[i] + " ");
        }
        System.out.print(System.lineSeparator());
    }

    private static void findMaxElementAndIndex(int[] mas) {
        int maxNumber = mas[0];
        int count = 0;
        for (int i = 1; i < mas.length; i++) {
            if (maxNumber < mas[i]) {
                maxNumber = mas[i];
                count = i;
            }
        }
        System.out.println("Max number = " + maxNumber + " Index = " + count);
    }
}
