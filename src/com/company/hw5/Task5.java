package com.company.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int input = checkNumber();
        int[] mas = new int[input];
        fillingAndPrintTheArray(input, mas);
        System.out.println(Arrays.toString(createNewEvenArray(mas)));

    }

    private static int checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension of Array -> ");
        int input = scanner.nextInt();
        while (input < 1) {
            System.out.print("Number must be more then 0, enter new number-> ");
            input = scanner.nextInt();
        }
        scanner.close();
        return input;
    }

    private static void fillingAndPrintTheArray(int input, int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * input);
            System.out.print(mas[i] + " ");
        }
        System.out.print(System.lineSeparator());
    }

    private static int[] createNewEvenArray(int[] mas) {
        int numberOfEvenElements = 0;
        for (int element : mas) {
            if (element % 2 == 0) {
                numberOfEvenElements++;
            }
        }
        int count = 0;
        int[] evenMas = new int[numberOfEvenElements];
        for (int element : mas) {
            if (element % 2 == 0) {
                evenMas[count] = element;
                count++;
            }
        }
        System.out.println("Number or even elements-> " + numberOfEvenElements);
        return evenMas;
    }

}
