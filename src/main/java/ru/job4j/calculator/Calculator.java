package ru.job4j.calculator;

import java.io.FileOutputStream;

public class Calculator {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;

        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        try (FileOutputStream file = new FileOutputStream("example.txt")) {
            file.write(
                    (onePlusTwo + System.lineSeparator()
                            + sixDivTwo + System.lineSeparator()
                            + fiveMinusTwo + System.lineSeparator()
                            + fourTimeTwo).getBytes()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
