package com.company.moduleHw8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mas = UserInputService.createTheArray();
        WorkWithArray.fillingTheArray(mas);
        Lock lock = new Lock(mas);
        lock.printArray();
        lock.getMas()[0] = 10;
        lock.printArray();
        System.out.println(Arrays.toString(mas));
        UserInputService.doAction(mas);
    }


}
