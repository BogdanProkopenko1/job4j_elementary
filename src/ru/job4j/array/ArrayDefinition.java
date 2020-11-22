package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Stas";
        names[1] = "Peter";
        names[2] = "Andrey";
        names[3] = "Bogdan";

        System.out.println("ages length is " + ages.length);
        System.out.println("surnames length is " + surnames.length);
        System.out.println("prices length is " + prices.length);
        System.out.println("names length is " + names.length);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
