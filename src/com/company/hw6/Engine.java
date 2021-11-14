package com.company.hw6;

import com.company.hw6.Enum.EngineTypeEnum;

public class Engine {
    private double power;
    private EngineTypeEnum engineTypeEnum;

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setEngineTypeEnum(EngineTypeEnum engineTypeEnum) {
        this.engineTypeEnum = engineTypeEnum;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", engineTypeEnum=" + engineTypeEnum +
                '}';
    }
}
