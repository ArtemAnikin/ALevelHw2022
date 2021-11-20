package com.company.hw7.actions;
import java.util.ArrayList;

public class Shop {

    public String getRandomName(int length) {
        StringBuilder PresentName = new StringBuilder();
        for (int i = 0; i < length; i++) {
            PresentName.append((char) (Math.random() * 26 + 97));
        }
        return PresentName.toString();
    }

    public void printPresents(ArrayList<String> presents){
        for (String element : presents){
            System.out.println(element + " ");
        }
    }
}
