package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");

        int in1 = 140;
        int in2 = 180;
        int expected1 = 2;
        int expected2 = 3;
        int out1 = Converter.rubleToEuro(in1);
        int out2 = Converter.rubleToDollar(in2);
        boolean passed1 = out1 == expected1;
        boolean passed2 = out2 == expected2;
        System.out.println("test result = " + passed1 + " and " + passed2);
    }
}
