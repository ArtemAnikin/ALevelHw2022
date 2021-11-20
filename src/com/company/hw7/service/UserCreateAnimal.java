package com.company.hw7.service;

import com.company.hw7.model.Animal;
import com.company.hw7.model.AnimalTypeEnum;

import java.util.Scanner;

public class UserCreateAnimal {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Animal createAnimal() {
        System.out.println("Animal types:");
        final AnimalTypeEnum[] animalTypeArray = AnimalTypeEnum.values();
        StringBuilder animalTypeString = new StringBuilder();
        for (int i = 0; i < animalTypeArray.length; i++) {
            animalTypeString.append(i).append(") ")
                    .append(animalTypeArray[i]).append("\n");
        }
        System.out.println(animalTypeString);
        int userInputAnimalType;
        do {
            System.out.println("Chose animal type: ");
            userInputAnimalType = SCANNER.nextInt();
        } while (userInputAnimalType < 0 || userInputAnimalType > animalTypeArray.length - 1);

        String userInputAnimalName;
        do {
            System.out.println("Enter animal name");
            userInputAnimalName = SCANNER.next();
        } while (userInputAnimalName.length() < 3 || userInputAnimalName.length() > 20);

        return new Animal(userInputAnimalName, animalTypeArray[userInputAnimalType]);
    }
}
