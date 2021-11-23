package com.company.hw7.model;
import com.company.hw7.ConstCoefficients;

public class Animal {
    private final String name;
    private final AnimalTypeEnum animalTypeEnum;
    private int age;
    private double hungry;
    private int money;
    private int clear;
    private double happy;
    private boolean isSick = false;
    private String[] Presents = new String[2];

    public Animal(String name, AnimalTypeEnum animalTypeEnum) {
        this.name = name;
        this.animalTypeEnum = animalTypeEnum;
        this.age = 1;
        this.hungry = 40;
        this.money = 0;
        this.clear = 100;
        this.happy = 50;
    }

    public String[] getPresents() {
        return Presents;
    }

    public void setPresents(String[] presents) {
        Presents = presents;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public String getName() {
        return name;
    }

    public void randomSick() {
        int sickChance = 10;
        sickChance *= this.clear < 50 ? ConstCoefficients.CLEAN_SICK_CHANCE : 1;
        this.isSick = (int) (Math.random() * 100) <= sickChance;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public boolean isSick() {
        return isSick;
    }

    public double getHappy() {
        return happy;
    }

    public int getAge() {
        return age;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public void setClear(int clear) {
        this.clear = clear;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public void addHungry(double hungry) {
        hungry *= hungry < 0 ? createIndexNegativeEffects() : 1;
        this.hungry += hungry;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }

    public int randomMoney(int from, int to) {
        this.addMoney((int) (Math.random() * to) + from);
        return this.money;
    }

    public void addClear(int clear) {
        clear *= clear < 0 ? createIndexNegativeEffects() : 1;
        this.clear += clear;
    }

    public void addHappy(double happy) {
        happy *= happy < 0 ? createIndexNegativeEffects() : 1;
        this.happy += happy;

    }

    public double createIndexNegativeEffects() {
        double index = 1;
        index *= this.hungry < 50 ? ConstCoefficients.HUNGRY_NEGATIVE_EFFECTS : 1;
        index *= this.happy < 10 ? ConstCoefficients.HAPPY_NEGATIVE_EFFECTS : 1;
        index *= this.isSick ? ConstCoefficients.IF_ANIMAL_SICK : 1;
        return index;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalTypeEnum=" + animalTypeEnum +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                ", isSick=" + isSick +
                '}';
    }
}
