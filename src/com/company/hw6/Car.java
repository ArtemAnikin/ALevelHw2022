package com.company.hw6;

import com.company.hw6.Enum.ColorEnum;
import com.company.hw6.Enum.EngineTypeEnum;
import com.company.hw6.Enum.ManufacturerEnum;

public class Car {
    private ManufacturerEnum manufacturerEnum;
    private ColorEnum colorEnum;
    private final Engine engine = new Engine();
    private int fuel;

    public Car(ManufacturerEnum manufacturerEnum, ColorEnum colorEnum, double power, EngineTypeEnum engineTypeEnum) {
        this.manufacturerEnum = manufacturerEnum;
        this.colorEnum = colorEnum;
        this.engine.setPower(power);
        this.engine.setEngineTypeEnum(engineTypeEnum);
        this.fuel = 100;
    }

    public Engine getEngine() {
        return engine;
    }

    public ManufacturerEnum getManufacturerEnum() {
        return manufacturerEnum;
    }

    public void setManufacturerEnum(ManufacturerEnum manufacturerEnum) {
        this.manufacturerEnum = manufacturerEnum;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void addFuel(int fuel) {
        this.fuel += fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturerEnum=" + manufacturerEnum.getRussianName() +
                ", colorEnum=" + colorEnum +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }

    public void startEngine(String name) {
        System.out.println(name + " запустил двигатель");
    }

    public boolean isEnoughPetrolLevel() {
        return fuel >= 50; //можно так использовать или лучше не нужно?)
    }
}
