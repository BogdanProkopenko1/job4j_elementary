package ru.job4j.poly;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " on road");
    }

    @Override
    public int time(int speed, int distance) {
        return distance / speed;
    }
}
