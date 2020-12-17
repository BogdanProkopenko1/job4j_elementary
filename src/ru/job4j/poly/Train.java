package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " on rails");
    }

    @Override
    public int time(int speed, int distance) {
        return distance / speed;
    }
}
