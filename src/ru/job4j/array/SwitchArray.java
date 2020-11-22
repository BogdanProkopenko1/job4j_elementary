package ru.job4j.array;

public class SwitchArray {

        public static int[] swap(int[] array, int source, int dest) {
            int change0 = array[source];
            int change1 = array[dest];
            array[source] = change1;
            array[dest] = change0;
            return array;
        }

    public static int[] swapBorder(int[] array) {
        int change0 = array[0];
        int change1 = array[array.length - 1];
        array[0] = change1;
        array[array.length - 1] = change0;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}