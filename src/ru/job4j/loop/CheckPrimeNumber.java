package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean checkResult = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                checkResult = false;
                break;
            }
        }
        return checkResult;
    }
}
