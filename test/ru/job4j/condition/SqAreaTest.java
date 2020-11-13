package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP12K2Then8() {
        int inP = 12;
        int inK = 2;
        int expected = 8;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP8K2Then2() {
        int inP = 8;
        int inK = 2;
        int expected = 2;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}