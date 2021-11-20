package com.company.hw7.actions;
import com.company.hw7.model.Animal;
import java.util.Scanner;

public class Medication {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void doAction(Animal animal) {
        if (animal.isSick()) {
            int needMoney = 50;
            System.out.printf("Для лечения необходимо потратить %d монет \n1 - вылечить, 2 - выход\n", needMoney);

            switch (SCANNER.nextInt()) {
                case 1:
                    if (animal.getMoney() > needMoney) {
                        int happy = 10;
                        int hungry = 70;
                        int clear = 80;
                        animal.setHappy(happy);
                        animal.setHungry(hungry);
                        animal.setClear(clear);
                        animal.addMoney(-needMoney);
                        animal.setSick(false);
                    } else {
                        System.out.printf("У вас нету %d монет\n", needMoney);
                    }
                    break;
                case 2:
                    break;

            }
        } else {
            System.out.printf("С %s всё в порядке\n", animal.getName());
        }
    }

}
