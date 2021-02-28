package ru.job4j.oop;

public class Battery {

    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        another.value = another.value + this.value;
        this.value = 0;
    }

    public static void main(String[] args) {
        Battery energy = new Battery(95);
        Battery power = new Battery(5);
        System.out.println("before " + energy.value);
        power.exchange(energy);
        System.out.println("after " + energy.value);
    }
}
