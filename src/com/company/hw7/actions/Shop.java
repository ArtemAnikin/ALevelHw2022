package com.company.hw7.actions;

import com.company.hw7.model.Animal;

import java.util.ArrayList;

public class Shop {

    private String getRandomName(int length) {
        StringBuilder PresentName = new StringBuilder();
        for (int i = 0; i < length; i++) {
            PresentName.append((char) (Math.random() * 26 + 97));
        }
        return PresentName.toString();
    }

    public void createPresent(Animal animal, int happy) {
        animal.addHappy(happy);
        String presentsName = this.getRandomName(4);
        animal.getPresents().add(animal.getPresents().size(), presentsName);
    }

    public void printPresents(ArrayList<String> presents) {
        for (String element : presents) {
            System.out.println(element + " ");
        }
    }
}
