package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int result = Max.max(5, 8);
        System.out.println("max value = " + result);

        result = Max.max(25, 6);
        System.out.println("max value = " + result);

        result = Max.max(35, 35);
        System.out.println("max value = " + result);
    }
}
