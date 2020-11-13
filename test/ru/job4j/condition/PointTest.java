package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when58to52Then6() {
        int expected = 6;
        int inX1 = 5;
        int inY1 = 8;
        int inX2 = 5;
        int inY2 = 2;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when48to61Then7() {
        int expected = 7;
        int inX1 = 6;
        int inY1 = 8;
        int inX2 = 6;
        int inY2 = 1;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when90to10Then70() {
        int expected = 8;
        int inX1 = 9;
        int inY1 = 0;
        int inX2 = 1;
        int inY2 = 0;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}