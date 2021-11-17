package com.company.moduleHw8;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        int[] mas = userInputService.createTheArray();
        WorkWithArray.fillingTheArray(mas);
        Lock lock = new Lock(mas);
        lock.printArray();
        lock.getMas()[0] = 10;
        lock.printArray();
        System.out.println(Arrays.toString(mas));
        userInputService.doAction(mas);
    }
}
