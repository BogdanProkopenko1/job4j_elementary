package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (i < left.length) {
                rsl[i] = left[i];
            } else if (i - left.length < right.length) {
                rsl[i] = right[i - left.length];
            }
        }
        int[] result = SortSelected.sort(rsl);
        return result;
    }
}