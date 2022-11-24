package com.zipcodewilmington.froilansfarm.produce;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest extends TestCase{

    public void testBeenEaten() {
        //Given
        Tomato objTomato=new Tomato();
        //when
       boolean actual= objTomato.beenEaten();
       //then
        Assert.assertTrue(actual);
    }
    public void hasBeenHarvest() {
        //Given
        Tomato objTomato=new Tomato();
        //when
        boolean actual= objTomato.hasBeenHarvest();
        //then
        Assert.assertTrue(actual);
    }

}