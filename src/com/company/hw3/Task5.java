package com.company.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x -> ");
        int x = scanner.nextInt();
        System.out.print("Enter y -> ");
        int y = scanner.nextInt();
        System.out.print("Choose symbol (\"+,-,*,/\") or \"exit\" ->");
        String ch = scanner.next();
        while (!ch.equals("exit")) {
            switch (ch) {
                case "+":
                    System.out.println(x + "+" + y + "=" + (x + y));
                    break;
                case "-":
                    System.out.println(x + "-" + y + "=" + (x - y));
                    break;
                case "*":
                    System.out.println(x + "*" + y + "=" + ((double) x * y));
                    break;
                case "/":
                    System.out.println(y == 0 ? "Error cannot be divided by 0 " : (x + "/" + y + "=" + (x / (double) y)));
                    break;
                default:
                    System.out.print("Choose correct symbol (\"+,-,*,/\") or \"exit\" ->");
                    ch = scanner.next();
            }
            System.out.print("Enter x -> ");
            x = scanner.nextInt();
            System.out.print("Enter y -> ");
            y = scanner.nextInt();
            System.out.print("Choose symbol (\"+,-,*,/\") or \"exit\" ->");
            ch = scanner.next();
        }
        System.out.println("Bye bye");
        scanner.close();
    }
}
