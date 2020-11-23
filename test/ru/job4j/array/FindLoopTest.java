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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3Then5() {
        int[] input = new int[] {5, 8, 6, 4, 7, 3, 1, 2};
        int result = FindLoop.indexOf(input, 3, 2, 6);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind11ThenMinus1() {
        int[] input = new int[]{5, 8, 6, 4, 7, 3, 1, 2};
        int result = FindLoop.indexOf(input, 11, 2, 6);
        int expected = -1;
        assertThat(result, is(expected));
    }
}