package com.company.hw6;

public class Garage {

    public static void checkCar(Car car) {
        double mustPower = 2.0;
        int mustFuelLevel = 50;
        if (car.getFuel() > mustFuelLevel) {
            if (car.getEngine().getPower() > mustPower) {
                System.out.print("Success");
                System.out.println(System.lineSeparator());
                System.out.print("Уровень топлина -> " + car.getFuel());
                System.out.println(System.lineSeparator());
                System.out.println("power -> " + car.getEngine().getPower());
            } else {
                System.out.print("Error");
                System.out.println(System.lineSeparator());
                System.out.println("power < " + mustPower);
            }
        } else {
            System.out.print("Error");
            System.out.println(System.lineSeparator());
            System.out.println("Уровень топлина меньше " + mustFuelLevel);
        }
    }

}