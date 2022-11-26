package com.zipcodewilmington.froilansfarm.animal;


import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void constructorTest(){
        Farmer person = new Farmer("Tyler", 25);
        String expected = "Tyler";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Pilot person = new Pilot("Madea", 36);
        person.setName("Grace");
        String expected = person.getName();
        Assert.assertEquals(expected, "Grace");

    }

    @Test
    public void getNameTest() {
        Pilot person = new Pilot("Trish", 59);
        person.setName("Michelle");
        String expected = person.getName();
        Assert.assertEquals(expected, "Michelle");

    }

    @Test
    public void fedTest() {
        Farmer person = new Farmer("Tyler", 25);
        boolean expected = false;
        boolean actual = person.fed();

    }

    @Test
    public void isRidingTest() {
        Farmer person = new Farmer("Tyler", 25);
        boolean expected = false;
        boolean actual = person.isRiding();
    }

}