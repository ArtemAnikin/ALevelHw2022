package com.company.moduleHw8;

import java.util.Arrays;

public class Lock {
    private final int[] mas;

    Lock(int[] mas){
        this.mas = mas;
    }
    public void printArray(){
        System.out.println(Arrays.toString(Arrays.copyOf(mas,mas.length)));
    }

    public int[] getMas() {
        return Arrays.copyOf(mas,mas.length);
    }
}
