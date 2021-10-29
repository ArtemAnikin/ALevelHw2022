package com.company.hw2;

import javax.swing.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        triangleArea(12, 5, 8);
        double number1 = -10 + Math.random() * 5;
        double number2 = 20 + Math.random() * 15;
        double number3 = Math.random() * 30;
        System.out.println((int) number1 + " " + (int) number2 + ' ' + (int) number3);
        minModuleNumber((int) number1, (int) number2, (int) number3);
        numberIsEven((int) number2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное чмсло -> ");
        int decimalNumber = scanner.nextInt();
        translateToBinary(decimalNumber);

    }

    public static void triangleArea(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            double s = 0.5 * (sideA + sideB + sideC);
            System.out.println("Area is -> " + Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
        } else {
            System.out.println("Такого треугольника не существует!");
        }
    }

    public static void minModuleNumber(int number1, int number2, int number3) {
        int mas[] = {number1, number2, number3};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] < 0 ? (mas[i] *= (-1)) + " " : mas[i] + " ");
        }
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            min = min > mas[i] ? min = mas[i] : min;
        }
        System.out.print(System.lineSeparator());
        System.out.println("min module number = " + min);


    }

    public static void numberIsEven(int number) {
        System.out.println("Number -> " + number + (number % 2 == 0 ? " is even" : " not even"));
    }

    public static void translateToBinary(int decimalNumber) {
        String rez = " ";
        while (decimalNumber > 0) {
            rez += decimalNumber % 2;
            decimalNumber /= 2;
        }
        System.out.println(new StringBuffer(rez).reverse());

    }


}
