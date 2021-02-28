package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        return    "-----" + System.lineSeparator()
                + "/   /" + System.lineSeparator()
                + "/   /" + System.lineSeparator()
                + "_____" + System.lineSeparator();
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}