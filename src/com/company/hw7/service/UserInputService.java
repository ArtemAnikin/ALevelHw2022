package com.company.hw7.service;

import com.company.hw7.actions.*;
import com.company.hw7.model.Animal;
import com.company.hw7.model.AnimalTypeEnum;

import java.util.Scanner;

public class UserInputService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final Food food = new Food();
    private final Games games = new Games();
    private final Shop shop = new Shop();
    private final Work work = new Work();
    private final Medication medication = new Medication();


    public void doAction(Animal animal) {
        int menuNumber = 0;
        StringBuilder createUserMenu = new StringBuilder("Chose action ").append("\n")
                .append(menuNumber++).append(") ").append("Exit").append("\n")
                .append(menuNumber++).append(") ").append("Food").append("\n")
                .append(menuNumber++).append(") ").append("Games").append("\n")
                .append(menuNumber++).append(") ").append("Shop").append("\n")
                .append(menuNumber++).append(") ").append("Work").append("\n")
                .append(menuNumber++).append(") ").append("Medication").append("\n");


        int userInputMenuNumber;
        while (true) {
            System.out.println(animal);
            System.out.print(createUserMenu);
            userInputMenuNumber = SCANNER.nextInt();
            switch (userInputMenuNumber) {
                case 0:
                    System.out.println("bye bye");
                    System.exit(0);
                    break;
                case 1:
                    food.doAction(animal);
                    break;
                case 2:
                    games.doAction(animal);
                    break;
                case 3:
                    shop.doAction(animal);
                    break;
                case 4:
                    work.doAction(animal);
                    break;
                case 5:
                    medication.doAction(animal);
                    break;
            }
        }
    }
}
