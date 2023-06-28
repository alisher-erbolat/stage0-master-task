package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int answer = 1;
        for (int i = 0; i < power; i++) {
            answer *= numberToPrint;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
