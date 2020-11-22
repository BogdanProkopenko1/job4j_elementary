package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] first = new int[5];
        for (int i = 0; i < first.length; i++) {
            first[i] = i * 2 + 3;
        }
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
        }
    }
}
