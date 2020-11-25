package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index1 = 0; index1 < array.length; index1++) {
            if (array[index1] == null) {
                for (int index2 = index1 + 1; index2 < array.length; index2++) {
                    if (array[index2] != null) {
                        array[index1] = array[index2];
                        array[index2] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index1] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
