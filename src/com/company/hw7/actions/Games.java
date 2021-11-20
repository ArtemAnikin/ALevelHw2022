package com.company.hw7.actions;

import com.company.hw7.model.Animal;

public class Games {
    private int gamesCount;

    public void doAction(Animal animal) {
        gamesCount++;
        int hungry = -3;
        int happy = 6;
        animal.addHungry(hungry);
        animal.addHappy(happy);
        if (gamesCount == 5) {
            animal.addAge(1);
            gamesCount = 0;
        }
        int moneyFrom = 1;
        int moneyTo = 10;
        animal.randomMoney(moneyFrom, moneyTo);
        if(!animal.isSick()){
            animal.randomSick();
        }
    }

}
