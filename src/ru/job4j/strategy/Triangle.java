package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return    "   ^    " + System.lineSeparator()
                + " /   \\ " + System.lineSeparator()
                + "/_____\\" + System.lineSeparator();
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}