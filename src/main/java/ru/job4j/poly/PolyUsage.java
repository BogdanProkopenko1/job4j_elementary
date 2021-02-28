package ru.job4j.poly;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle koenigsegg = new Car();
        Vehicle astonMartin = new Car();
        Vehicle boeing = new Plane();
        Vehicle airbus = new Plane();
        Vehicle sapsan = new Train();
        Vehicle lastochka = new Train();
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = koenigsegg;
        vehicles[1] = astonMartin;
        vehicles[2] = boeing;
        vehicles[3] = airbus;
        vehicles[4] = sapsan;
        vehicles[5] = lastochka;
        for (Vehicle print : vehicles) {
            print.move();
        }
    }
}
