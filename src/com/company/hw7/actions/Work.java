package com.company.hw7.actions;
import com.company.hw7.model.Animal;

public class Work {
    private int workCount;

    public void doAction(Animal animal) {
        int workAge = 5;
        int needHappy = 20;
        if (animal.getHappy() > needHappy) {
            if (animal.getAge() >= workAge) {
                int hungry = -4;
                int happy = -2;
                animal.addHungry(hungry);
                animal.addHappy(happy);
                if (workCount == 6) {
                    animal.addAge(1);
                    workCount = 0;
                }
                int moneyFrom = 5;
                int moneyTo = 20;
                animal.randomMoney(moneyFrom, moneyTo);
                if (!animal.isSick()) {
                    animal.randomSick();
                }

            } else {
                System.out.printf("Вы не можете работать! \n Вам нет %d лет\n", workAge);
            }
        } else {
            System.out.printf("Вы не можете работать! \n Счастье ниже %d \n", needHappy);
        }

    }
}
