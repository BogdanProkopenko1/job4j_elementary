package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan201Then11615() {
        short in = 201;
        double expected = 116.15;
        double out = Fit.manWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenWoman162Then598() {
        short in = 162;
        double expected = 59.8;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
    @Test
    public void whenMan190Then1035() {
        short in = 190;
        double expected = 103.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
    @Test
    public void whenWoman180Then805() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
}