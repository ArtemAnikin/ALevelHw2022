package com.company.hw7.actions;

import com.company.hw7.model.Animal;

import java.util.Scanner;

public class Shop {
    private final Scanner scanner = new Scanner(System.in);

    public void doAction(Animal animal) {
        int menuNumber = 0;
        StringBuilder createUserMenu = new StringBuilder("Chose action ").append("\n")
                .append(menuNumber++).append(") ").append("Выйти в главное меню").append("\n")
                .append(menuNumber++).append(") ").append("Купить подарок за 100").append("\n")
                .append(menuNumber++).append(") ").append("Купить подарок за 150").append("\n")
                .append(menuNumber++).append(") ").append("Купить подарок за 200").append("\n");


        int userInputMenuNumber;
        while (true) {
            System.out.println(animal);
            System.out.print(createUserMenu);
            userInputMenuNumber = scanner.nextInt();
            switch (userInputMenuNumber) {
                case 0:
                    System.exit(0);
                    break;
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }
}
