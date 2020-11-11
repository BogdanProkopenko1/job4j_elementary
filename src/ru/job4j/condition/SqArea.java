package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        float h = p / (2*(k+1));
        float l = h * k;
        float rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
