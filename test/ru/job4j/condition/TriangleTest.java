package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void when2to2to2ThenTrue() {
        boolean out = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(out, is(true));
    }

    @Test
    public void when511to704to30ThenFalse() {
        boolean out = Triangle.exist(51.1, 70.4, 3.0);
        assertThat(out, is(false));
    }
}