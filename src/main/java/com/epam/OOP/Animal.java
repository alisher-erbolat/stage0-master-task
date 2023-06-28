package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String def = "";
        if (hasFur) def = "a";
        else def = "no";

        String paw = "";
        if (numberOfPaws==1) paw = " paw";
        else paw = " paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + paw + " and " + def + " fur.";
    }
}
