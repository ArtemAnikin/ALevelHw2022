package com.company.hw3;

public class Task3 {
    public static void main(String[] args) {
        numberOf();
    }

    public static void numberOf() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 60; j++) {
            }
            StringBuffer buffer = new StringBuffer(Integer.toString(i));
            buffer.reverse();
            System.out.println(buffer);
        }
    }

}
