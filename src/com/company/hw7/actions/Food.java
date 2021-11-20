package com.company.hw7.actions;

import com.company.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {
        int hungry = 5;
        int clear = -2;
        animal.addHungry(hungry);
        animal.addClear(clear);
    }
}
