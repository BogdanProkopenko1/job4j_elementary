package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        System.out.println("Game of eleven matches." + System.lineSeparator());
        int sticks = 11;
        int counter = 0;
        Scanner in = new Scanner(System.in);
        String player1 = in.nextLine();
        String player2 = in.nextLine();
        while (sticks > 0) {
            System.out.println("left is " + sticks);
            int select = Integer.valueOf(in.nextLine());
            if (counter % 2 == 0) {
                System.out.println("Player " + player1 + " walked.");
            } else {
                System.out.println("Player " + player2 + " walked.");
            }
            if (select > 0 && select < 4 && sticks - select >= 0) {
                sticks -= select;
                counter++;
            } else {
                System.out.println("Choice is impossible. Try again.");
            }
            if (sticks == 0) {
                if (counter % 2 == 0) {
                    System.out.println("Player " + player1 + " is winner!");
                } else {
                    System.out.println("Player " + player2 + " is winner!");
                }
            }
        }
    }
}