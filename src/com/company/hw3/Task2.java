package com.company.hw3;

public class Task2 {
    public static void main(String[] args) {
        numberOfLuckyTickets();
    }

    public static void numberOfLuckyTickets() {
        int count = 0;
        int leftNumber;
        int rightNumber;
        for (int i = 1001; i <= 999999; i++) {
            leftNumber = i / 1000;
            rightNumber = i % 1000;
            if (sumOfNumbers(leftNumber) == sumOfNumbers(rightNumber)) {
                count++;
            }
        }
        System.out.println("Number of lucky numbers = " + count);
    }

    public static int sumOfNumbers(int number) {
        int rez = 0;
        while (number > 0) {
            rez += number % 10;
            number /= 10;
        }
        return rez;
    }
}
