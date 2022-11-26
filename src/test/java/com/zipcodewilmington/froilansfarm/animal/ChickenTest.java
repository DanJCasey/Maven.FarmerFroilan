package com.zipcodewilmington.froilansfarm.animal;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void inheritanceTest() {
        Chicken chicken = new Chicken("Bob", 2);
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken("Bob", 2);
        String expected = "Cluck!";
        String actual = Chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fedTest(){
        Chicken chicken = new Chicken("Bob", 2);
        boolean expected = false;
        boolean actual = Chicken.fed();
        Assert.assertEquals(expected, actual);
    }
}