package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point dot) {
        return sqrt(pow(this.x - dot.x, 2) + pow(this.y - dot.y, 2) + pow(this.z - dot.z, 2));
    }

    public static void main(String[] args) {
        Point point0 = new Point(1, 2);
        Point point1 = new Point(6, 5);
        double distance = point0.distance(point1);
        System.out.println(distance);
        Point point2 = new Point(10, 1, 8);
        Point point3 = new Point(10, 1, 5);
        distance = point2.distance3d(point3);
        System.out.println(distance);
    }
}
