package com.patricioic.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void carStartedShouldReturnCarStarted() {

        Car c = new Car();

        Assert.assertTrue(c.start().equals("Car started"));
    }

    @Test
    public void carRunningShouldReturnCarRunning() {

        Car c = new Car();

        Assert.assertTrue(c.run().equals("Car running"));
    }

    @Test
    public void carStoppedShouldReturnCarStopped() {

        Car c = new Car();

        Assert.assertTrue(c.stop().equals("Car stopped"));
    }
}

