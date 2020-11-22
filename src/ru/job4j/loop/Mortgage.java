package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            percent /= 100;
            amount = ((amount * percent) + amount) - salary;
            year++;
        }
        return year;
    }
}