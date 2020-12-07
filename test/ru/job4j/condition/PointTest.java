package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when102030to100200300then336() {
        Point first = new Point(10, 20, 30);
        Point second = new Point(100, 200, 300);
        Assert.assertEquals(first.distance3d(second), 336, 0.9);
    }
    @Test
    public void distance3d() {
        Point first = new Point(5, 5, 5);
        Point second = new Point(10, 10, 10);
        Assert.assertEquals(first.distance3d(second),8, 0.9);
    }
}