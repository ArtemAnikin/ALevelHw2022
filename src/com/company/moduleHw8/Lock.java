package com.company.moduleHw8;

import java.util.Arrays;

public class Lock {
    private final int[] mas;

    Lock(int[] mas){
        this.mas = mas;
    }
    public void printArray(){
        System.out.println(Arrays.toString(mas.clone()));
    }

    public int[] getMas() {
        return mas.clone();
    }
}
