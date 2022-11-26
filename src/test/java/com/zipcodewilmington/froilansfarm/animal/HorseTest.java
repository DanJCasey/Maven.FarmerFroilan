package com.zipcodewilmington.froilansfarm.animal;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void inheritanceTest() {
        Horse horse = new Horse("Sarge", 4);
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Neigh!";
        String actual = Horse.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void beingRidTest() {
        Horse horse = new Horse("Sarge", 4);
        boolean expected = false;
        boolean actual = Horse.beingRid();
        Assert.assertFalse(actual);
    }

    @Test
    public void fedTest(){
        Horse horse = new Horse("Sarge", 4);
        boolean expected = false;
        boolean actual = Horse.fed();
        Assert.assertEquals(expected, actual);
    }
}