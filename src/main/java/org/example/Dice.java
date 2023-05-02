package org.example;

public class Dice {
    public static int rollDice() {
        return (int)(Math.random()*6) + 1; // 1 - 6
    }
}
