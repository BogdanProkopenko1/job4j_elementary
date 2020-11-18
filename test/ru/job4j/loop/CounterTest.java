package ru.job4j.loop;

import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when10to20Then90() {
        int rsl = Counter.sumByEven(10, 20);
        int expected = 90;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when1to5Then15() {
        int rsl = Counter.sum(1, 5);
        int expected = 15;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when5to7Then18() {
        int rsl = Counter.sum(5, 7);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}