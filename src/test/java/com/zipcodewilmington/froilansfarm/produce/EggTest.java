package com.zipcodewilmington.froilansfarm.produce;

import junit.framework.TestCase;
import org.junit.Assert;

public class EggTest extends TestCase {

    public void testBeenEaten() {
        //Given
        Egg objEgg=new Egg();
        //when
        boolean actual= objEgg.beenEaten();
        //then
        Assert.assertTrue(actual);
    }

    public void testHasBeenHarvest() {
        //Given
        Egg objEgg=new Egg();
        //when
        boolean actual= objEgg.hasBeenHarvest();
        //then
        Assert.assertTrue(actual);
    }
}