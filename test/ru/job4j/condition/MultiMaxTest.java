package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void when1to4to2Then4() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void when4to2to1Then4() {
        int result = MultiMax.max(4, 2, 1);
        assertThat(result , is(4));
    }
    @Test
    public void when2to1to4Then4() {
        int result = MultiMax.max(2, 1, 4);
        assertThat(result, is(4));
    }
}