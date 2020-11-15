package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I cant.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(false, true);
        permission(true, false);
        permission(false, false);
    }
}
