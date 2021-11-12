package com.company.hw6.Enum;

public enum ManufacturerEnum {
    AUDI("АУДИ"), MERCEDES("МЕРСЕДЕС"), BMW("БМВ");

    String russianName;

    ManufacturerEnum(String name) {
        this.russianName = name;
    }

    public String getRussianName() {
        return russianName;
    }
}
