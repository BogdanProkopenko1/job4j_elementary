package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean checkResult = false;
        int rsl = 2;
        for (int i = 1; i < (number - 1); i++) {
            rsl += 1;
            if (number > 2 && number % 2 == 0) {
                checkResult = false;
            }
            if (number % rsl == 0 && number / rsl == 1) {
                checkResult = true;
                break;
            } else {
                checkResult = false;
            }
            rsl += 1;
        }
        return checkResult;
    }
}
