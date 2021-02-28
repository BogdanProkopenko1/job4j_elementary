package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int change0 = array[3];
        int change1 = array[2];
        int change2 = array[1];
        int change3 = array[4];
        int change4 = array[0];

        array[0] = change0;
        array[1] = change1;
        array[2] = change2;
        array[3] = change3;
        array[4] = change4;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}