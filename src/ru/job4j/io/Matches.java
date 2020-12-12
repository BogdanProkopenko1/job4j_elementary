package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        System.out.println("Game of eleven matches." + System.lineSeparator() + "Player number 1 is walking.");
        int sticks = 11;
        while (sticks > 0) {
            System.out.println("left is " + sticks + System.lineSeparator());
            Scanner in = new Scanner(System.in);
            int select = Integer.valueOf(in.nextLine());
            if (select > 0 && select < 4 && sticks - select >= 0) {
                sticks -= select;
            } else {
                System.out.println("Choice is impossible. Try again.");
            }
            if (sticks == 0) {
                System.out.println("This player is winner!");
            }
        }
    }
}
