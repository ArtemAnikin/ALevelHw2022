package com.company.hw6;

import com.company.hw6.Enum.EngineTypeEnum;

public class Engine {
    protected double power;
    public EngineTypeEnum engineTypeEnum;

    public Engine() {
    }

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
