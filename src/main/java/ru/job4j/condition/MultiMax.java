package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int rsl = third;
        if (first > second) {
            if (first > third) {
                rsl = first;
            } else {
                rsl = third;
            }
        } else if (second > third) {
            rsl = second;
        }
        return rsl;
    }
}