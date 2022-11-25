package com.zipcodewilmington.froilansfarm.produce;

import junit.framework.TestCase;
import org.junit.Assert;

public class CornTest extends TestCase {

    public void testBeenEaten() {
        //Given
        Corn objCorn=new Corn();
        //when
        boolean actual= objCorn.beenEaten();
        //then
        Assert.assertTrue(actual);
    }

    public void testHasBeenHarvest() {
        //Given
        Corn objCorn=new Corn();
        //when
        boolean actual= objCorn.hasBeenHarvest();
        //then
        Assert.assertTrue(actual);
    }
}