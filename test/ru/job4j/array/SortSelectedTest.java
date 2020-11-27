package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort0() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 4, 1, 2, 5, 8, 9, 7, 6, 11, 10, 20, 4651, 56};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 56, 4651};
        assertThat(result, is(expect));
    }
}