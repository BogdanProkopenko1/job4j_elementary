package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test  //variant 1
    public void when50to30Then50() {
        int left = 50;
        int right = 30;
        int expected = 50;
        int out = Max.max(left, right);
        Assert.assertEquals(out, expected);
    }

    @Test  //variant 2
    public void when11to56Then5() {
        int out = Max.max(11, 56);
        Assert.assertEquals(out, 56);
    }

    @Test  //variant 3
    public void when125to125Then125() {
        int out = Max.max(125, 125);
        assertThat(out, is(125));
    }
}