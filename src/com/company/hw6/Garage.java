package com.company.hw6;

public class Garage {

    public static void checkCar(Car car) {
        double mustPower = 2.0;
        if (car.isEnoughPetrolLevel()) {
            if (car.getEngine().getPower() > mustPower) {
                System.out.println("Success");
                System.out.println("Уровень топлина -> " + car.getFuel());
                System.out.println("power -> " + car.getEngine().getPower());
            } else {
                System.out.println("Error");
                System.out.println("power < " + mustPower);
            }
        } else {
            System.out.println("Error");
            System.out.println("Уровень топлина меньше " + 50);
        }
    }

}
