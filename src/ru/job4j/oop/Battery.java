package ru.job4j.oop;

public class Battery {

    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        this.value = this.value - another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Battery charge = new Battery(100);
        Battery discharge = new Battery(5);
        System.out.println("before " + charge.value);
        charge.exchange(discharge);
        System.out.println("after " + charge.value);
    }
}
