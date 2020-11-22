package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            percent /= 100;
            debt = ((amount * percent) + amount) - salary;
            year++;
        }
        return year;
    }
}