package com.company.hw1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "Artem";
        String serName = "Anikin";
        System.out.println(name + ' ' + serName);
        checkNameLength(name);
        System.out.print("Enter number of steps ->");
        increaseNumberByTwo(in.nextInt());
        in.close();
    }

    public static void checkNameLength(String name) {
        if (name.length() > 7) {
            System.out.println("more then 7");
        } else {
            System.out.println("less then 7");
        }
    }

    public static void increaseNumberByTwo(int numOfSteps) {
        int count = 5;
        for (int i = 0; i <= numOfSteps; i++) {
            System.out.println("Step " + i + " number " + count);
            count += 2;
        }
    }
}

