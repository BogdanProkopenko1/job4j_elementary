package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    /* public static void main(String[] args) {
        boolean result = Triangle.exist(5, 4, 8);
        if (result) {
            System.out.println("Triangle is exist!");
        } else {
            System.out.println("Triangle is not exist!");
        }
    }
    */
}
