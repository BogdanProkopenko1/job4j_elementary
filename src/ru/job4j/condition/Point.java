package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;

        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double total = first + second;
        double rsl = Math.sqrt(total);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(2, 5,8 ,2);
        System.out.println("result (2, 5) to (8, 2) " + result);

        result = Point.distance(5, 3, 1, 0);
        System.out.println("result (5, 3) to (1, 0) " + result);

        result = Point.distance(9,  8, 7, 6);
        System.out.println("result (9, 8) to (7, 6) " + result);
    }
}
