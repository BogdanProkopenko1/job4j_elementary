package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void when50to30Then50() {
        assertThat(Max.max(30, 50), is(50));
    }

    @Test
    public void when11to56Then56() {
        assertThat(Max.max(11, 56), is(56));
    }

    @Test
    public void when125to125Then125() {
        assertThat(Max.max(125, 125), is(125));
    }

    @Test
    public void whenF1s2t3Then3() {
        assertThat(Max.max(1, 2, 3), is(3));
    }

    @Test
    public void when100to150to200to1000Then1000() {
        assertThat(Max.max(100, 150, 200, 1000), is(1000));
    }
}