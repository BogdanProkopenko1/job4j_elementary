package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] in = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(in, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void when8Then1() {
        int[] in = new int[] {5, 8, 1, 2, 13, 4, 20};
        int result = FindLoop.indexOf(in, 8);
        assertThat(result, is(1));
    }

    @Test
    public void when44ThenMinus1() {
        int[] in = new int[] {15, 58, 23, 13, 43, 20};
        int result = FindLoop.indexOf(in, 44);
        assertThat(result, is(-1));
    }
}