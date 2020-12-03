package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point point0 = new Point(1, 2);
        Point point1 = new Point(6, 5);
        double distance = point0.distance(point1);
        System.out.println(distance);
    }
}
