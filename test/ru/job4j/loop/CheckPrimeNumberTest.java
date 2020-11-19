package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
    @Test
    public void when25() {
        boolean rsl = CheckPrimeNumber.check(25);
        assertThat(rsl, is(false));
    }

    @Test
    public void when47() {
        boolean rsl = CheckPrimeNumber.check(47);
        assertThat(rsl, is(true));
    }
}