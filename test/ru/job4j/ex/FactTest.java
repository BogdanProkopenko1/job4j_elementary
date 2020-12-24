package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalcFalse() {
        new Fact().calc(-33);
    }

    @Test
    public void whenCalcTrue() {
        assertThat(new Fact().calc(4), is(24));
    }
}