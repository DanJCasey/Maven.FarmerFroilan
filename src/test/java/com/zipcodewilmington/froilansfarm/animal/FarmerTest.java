package com.zipcodewilmington.froilansfarm.animal;


import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void constructorTest(){
        Farmer farmer = new Farmer("Tyler", 25);
        String expected = "Tyler";
        String actual = farmer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritanceTest() {
        Farmer farmer = new Farmer("Tyler", 25);
        Assert.assertTrue(farmer instanceof Animal);
    }

    @Test
    public void fedTest() {
        Farmer farmer = new Farmer("Tyler", 25);
        boolean expected = false;
        boolean actual = farmer.fed();

    }

}