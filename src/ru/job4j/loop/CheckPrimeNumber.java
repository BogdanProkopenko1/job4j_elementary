package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int count = 2;
        while (count < number) {
            if (number % count == 0) {
                prime = false;
                break;
            }
            count += 1;
        }
        return prime;
    }
}
