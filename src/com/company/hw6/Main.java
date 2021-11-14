package com.company.hw6;

import com.company.hw6.Enum.ColorEnum;
import com.company.hw6.Enum.EngineTypeEnum;
import com.company.hw6.Enum.ManufacturerEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car(ManufacturerEnum.BMW, ColorEnum.BLACK, 3.0, EngineTypeEnum.PETROL);
        Car car2 = new Car(ManufacturerEnum.AUDI, ColorEnum.GREEN, 2.5, EngineTypeEnum.DIESEL);
        Car car3 = new Car(ManufacturerEnum.MERCEDES, ColorEnum.RED, 2.0, EngineTypeEnum.ELECTRO);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.startEngine("Артём");
        System.out.println("Уровень бензина выше 50 -> " + car1.isEnoughPetrolLevel());
        useCar(car1);
        checkFuelLevel(car1);
        refuelTheCar(car1);
        checkFuelLevel(car1);
        changeColorToWhite(car2);
        changeManufacturerToBMW(car3);
        Garage.checkCar(car1);
        Garage.checkCar(car3);

    }

    public static void useCar(Car car) {
        int fuelWasted = (int) (Math.random() * 9) + 5;
        System.out.println("Топлиов уменьшено на " + fuelWasted);
        car.addFuel(-fuelWasted);
    }

    public static void checkFuelLevel(Car car) {
        System.out.println("Уровень топлина -> " + car.getFuel());
    }

    public static void refuelTheCar(Car car) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("До какого уровня запрвить авто -> ");
        int fuelNumber = scanner.nextInt();
        while (fuelNumber <= (int) car.getFuel()) {
            System.out.print("Введите значение выше текушего уровня топлива -> ");
            fuelNumber = scanner.nextInt();
        }
        for (int i = (int) car.getFuel(); i <= fuelNumber; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
        car.setFuel(fuelNumber);
        System.out.println("Авто заправлено, можете ехать!");
    }

    public static void changeColorToWhite(Car car){
        if(car.getColorEnum().equals(ColorEnum.WHITE)){
            System.out.println("Ваше авто и так -> " + car.getColorEnum());
        } else {
            car.setColorEnum(ColorEnum.WHITE);
            System.out.println("Теперь цвет вашего авто -> " + car.getColorEnum());
        }
    }

    public static void changeManufacturerToBMW(Car car){
        if(car.getManufacturerEnum().equals(ManufacturerEnum.BMW)){
            System.out.println("Ваше авто и так -> " + car.getManufacturerEnum().getRussianName());
        } else {
            car.setManufacturerEnum(ManufacturerEnum.BMW);
            System.out.println("Вы изменили авто на -> " + car.getManufacturerEnum().getRussianName());
        }
    }

}
