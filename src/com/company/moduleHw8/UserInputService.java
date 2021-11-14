package com.company.moduleHw8;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputService {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] createTheArray() {
        System.out.print("Enter array dimension-> ");
        int arrayDimension = scanner.nextInt();

        while (arrayDimension < 10) {
            System.out.print("Enter number more then '9' -> ");
            arrayDimension = scanner.nextInt();
        }
        return new int[arrayDimension];
    }

    public static void doAction(int[] mas) {
        StringBuilder builder = new StringBuilder("Выберете действие: ").append(System.lineSeparator());
        int menuNumber = 0;
        builder.append(menuNumber++).append(") Выйти ").append(System.lineSeparator());
        builder.append(menuNumber++).append(") Сортировать по возроставнию ").append(System.lineSeparator());
        builder.append(menuNumber++).append(") Сортировать по убыванию ").append(System.lineSeparator());
        builder.append(menuNumber++).append(") Вывести на экран исходный массив").append(System.lineSeparator());

        int userAction;
        while (true) {
            System.out.print(builder);
            userAction = scanner.nextInt();
            switch (userAction) {
                case 0:
                    System.out.println("Вы закрыли программу!");
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(Arrays.toString(WorkWithArray.maxSort(mas)));
                    System.out.println("Каждое третье число массива возвести в куб");
                    System.out.println(Arrays.toString(WorkWithArray.cubEveryThirdNumber(WorkWithArray.maxSort(mas))));
                    break;
                case 2:
                    System.out.println(Arrays.toString(WorkWithArray.minSort(mas)));
                    System.out.println("Каждое третье число массива возвести в куб");
                    System.out.println(Arrays.toString(WorkWithArray.cubEveryThirdNumber(WorkWithArray.minSort(mas))));
                    break;
                case 3:
                    System.out.println(Arrays.toString(mas));
                    break;
                default:
                    System.out.println("Введите число от 0-" + menuNumber + "!!!");
            }
        }
    }

}
