package com.company.hw3;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write some string -> ");
        String str1 = scanner.nextLine();
        System.out.println(str1.replaceAll("\\s+", "").length());
    }
}
