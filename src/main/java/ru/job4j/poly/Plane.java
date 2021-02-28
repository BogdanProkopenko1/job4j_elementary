package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " in the air");
    }

    @Override
    public int time(int speed, int distance) {
        return distance / speed;
    }
}
