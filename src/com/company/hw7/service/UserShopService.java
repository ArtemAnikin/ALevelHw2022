package com.company.hw7.service;

import com.company.hw7.actions.Shop;
import com.company.hw7.model.Animal;

import java.util.Scanner;

public class UserShopService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final Shop shop = new Shop();

    public void doAction(Animal animal) {
        int presentNumber = 0;
        int presentPrisesIndex = 0;
        int presentNameLength = 4;
        int happy = 0;
        int[] presentPrises = {100, 150, 200};
        StringBuilder createPresentUserMenu = new StringBuilder("Chose action").append("\n")
                .append(presentNumber++).append(") ").append("Выйти в главное меню").append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за ").append(presentPrises[presentPrisesIndex++]).append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за ").append(presentPrises[presentPrisesIndex++]).append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за ").append(presentPrises[presentPrisesIndex++]).append("\n")
                .append(presentNumber++).append(") ").append("Показать мои подарки").append("\n");

        int userInputPresentNumber;
        boolean whileFlag = true;
        while (whileFlag) {
            System.out.println(animal.toString());
            System.out.println(createPresentUserMenu);
            userInputPresentNumber = SCANNER.nextInt();
            switch (userInputPresentNumber) {
                case 0:
                    whileFlag = false;
                    break;
                case 1:
                    happy = 20;
                    break;
                case 2:
                    happy = 25;
                    presentNameLength = 5;
                    break;
                case 3:
                    happy = 30;
                    presentNameLength = 6;
                    break;
                case 4:
                    if (animal.getPresents()[0] != null) {
                        shop.printPresents(animal.getPresents());
                    } else {
                        System.out.println("У вас нету подарков");
                    }
                    break;
                default:
                    System.out.println("Выберите пункт меню!");
                    userInputPresentNumber = SCANNER.nextInt();
                    break;
            }
            if (userInputPresentNumber >= 1 && userInputPresentNumber <= presentPrises.length) {
                if (animal.getMoney() >= presentPrises[userInputPresentNumber - 1]) {
                    String newPresentName = shop.createPresent(animal, happy, presentNameLength);
                    animal.addMoney(-presentPrises[userInputPresentNumber - 1]);
                    System.out.printf("Подарок %s Успешно добавлен!", newPresentName);
                } else {
                    System.out.printf("У вас недостаточно денег, нужно -> %d \n", presentPrises[userInputPresentNumber - 1]);
                }
            }
        }
    }

}
