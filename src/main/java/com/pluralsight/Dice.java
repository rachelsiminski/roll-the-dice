package com.pluralsight;

public class Dice {

    public static void main(String[] args) {

        int die1 = 0;
        int die2 = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 100; ++i) {
            die1 = roll();
            die2 = roll();
            sum = die1 + die2;

            if (sum == 2 || sum == 4 || sum == 6 || sum == 7) {
                ++count;
            }
        }

        System.out.println(count);
    }

    public static int roll() {
        return (int)(Math.random() * (6 - 1 + 1)) + 1;
    }
}
