package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
            System.out.println(" ");
        } else {
            System.out.println("It is not for you.");
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Cinema.access(11);
        Cinema.access(58);
        Cinema.access(87);
        Cinema.access(15);
    }
}
