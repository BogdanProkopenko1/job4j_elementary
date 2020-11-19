package ru.job4j.loop;

import java.util.Scanner;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            System.out.println(month);
            ivan = ivan * 3;
            nik = nik * 2;
            month += 1;
        }
        return month;
    }
}