package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers + " passengers in bus.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 40;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        System.out.println(bus.refuel(20) + " roubles.");
        bus.passengers(20);
    }
}