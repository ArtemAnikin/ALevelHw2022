package com.company.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double secret = 5 + Math.random() * 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number -> ");
        int guess = scanner.nextInt();

        while(guess != (int)secret){
            if(secret<guess){
                System.out.println("less then " + guess);
            }else{
                System.out.println("More then " + guess);
            }
            System.out.print("Try again -> ");
            guess = scanner.nextInt();
        }
        System.out.println("You win!!! Secret = " + (int)secret);
    }
}
