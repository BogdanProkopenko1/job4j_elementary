package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Задайте вопрос с вариантами ответов да, нет, возможно.");
        Scanner rsl = new Scanner(System.in);
        String weather = rsl.nextLine();
        System.out.println("Question = " + weather);
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes!");
        } else if (answer == 1) {
            System.out.println("No!");
        } else {
            System.out.println("Possible.");
        }
    }
}
