package com.company.hw7.actions;

import com.company.hw7.model.Animal;
import java.util.Arrays;

public class Shop {

    private String getRandomName(int length) {
        StringBuilder PresentName = new StringBuilder();
        for (int i = 0; i < length; i++) {
            PresentName.append((char) (Math.random() * 26 + 97));
        }
        return PresentName.toString();
    }

    public String createPresent(Animal animal, int happy, int presentNameLength) {
        animal.addHappy(happy);
        int lastElementIndex = 0;
        for (int i = 0; i < animal.getPresents().length; i++) {
            if (animal.getPresents()[i] == null) {
                animal.getPresents()[i] = this.getRandomName(presentNameLength);
                lastElementIndex = i;
                break;
            } else if (animal.getPresents()[animal.getPresents().length-1] != null) {
                animal.setPresents(Arrays.copyOf(animal.getPresents(), animal.getPresents().length * 2));
                animal.getPresents()[i] = this.getRandomName(presentNameLength);
                lastElementIndex = i;
            }
        }
        return animal.getPresents()[lastElementIndex];
    }

    public void printPresents(String[] presents) {
        for (String element : presents) {
            if(element != null){
            System.out.println(element + ' ');
            }
        }
    }
}
