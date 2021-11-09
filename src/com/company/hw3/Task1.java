package com.company.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ->");
        int userNumber = scanner.nextInt();
        sumElementsOfTheNumber(userNumber);
    }

    public static void sumElementsOfTheNumber(int number) {
        int rez = 0;
        while (number > 0) {
            rez += number % 10;
            number/=10;
        }
        System.out.println("result = " + rez);
    }
}
