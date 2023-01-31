package com.epam.OOP;

class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = hasFur ? "a" : "no";
        String paws = numberOfPaws == 1 ? "paw" : "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paws + " and " + fur + " fur.";
    }
}
