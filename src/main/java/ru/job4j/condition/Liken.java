package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(first + " больше чем " + second + " это " + result);

        result = first < second;
        System.out.println(first + " меньше чем " + second + " это " + result);

        result = first == second;
        System.out.println(first + " равно " + second + " это " + result);
    }
}
