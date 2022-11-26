package com.zipcodewilmington.froilansfarm.animal;


import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void constructorTest(){
        Pilot pilot = new Pilot("Sam", 19);
        String expected = "Sam";
        String actual = pilot.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritanceTest() {
        Pilot pilot = new Pilot("Sam", 19);
        Assert.assertTrue(pilot instanceof Animal);
    }

    @Test
    public void setNameTest() {
        Pilot pilot = new Pilot("Madea", 36);
        pilot.setName("Grace");
        String expected = pilot.getName();
        Assert.assertEquals(expected, "Grace");

    }

    @Test
    public void getNameTest() {
        Pilot pilot = new Pilot("Trish", 59);
        pilot.setName("Michelle");
        String expected = pilot.getName();
        Assert.assertEquals(expected, "Michelle");

    }

    @Test
    public void fedTest() {
        Pilot pilot = new Pilot("Erica", 29);
        boolean expected = false;
        boolean actual = pilot.fed();

    }

}