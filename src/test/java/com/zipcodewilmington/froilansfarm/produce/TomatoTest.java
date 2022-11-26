package com.zipcodewilmington.froilansfarm.produce;

import junit.framework.TestCase;
import org.junit.Assert;

public class TomatoTest extends TestCase{

//    public void testGetEatable(){
//        //Given
//        Tomato objTomato=new Tomato();
//        //When
//        boolean actual=objTomato.isEatable();
//        //Then
//        Assert.assertTrue(actual);
//    }
//    public void testSetEatable(){
//        //Given
//        Tomato objTomato=new Tomato();
//        boolean expected=false;
//        //When
//        objTomato.setEatable(false);
//        //Then
//        Assert.assertEquals(expected, objTomato.isEatable());
//    }
//    public void testGetHarvestable(){
//        //Given
//        Tomato objTomato=new Tomato();
//        //When
//        boolean actual=objTomato.isHarvestable();
//        //Then
//        Assert.assertTrue(actual);
//    }
//    public void testSetHarvestable(){
//       //Given
//        Tomato objTomato=new Tomato();
//        boolean expected=false;
//        //When
//        objTomato.setHarvestable(false);
//        //Then
//        Assert.assertEquals(expected, objTomato.isHarvestable());
//    }
//
//    public void testBeenEaten() {
//        //Given
//        Tomato objTomato=new Tomato();
//        //when
//       boolean actual= objTomato.beenEaten();
//       //then
//        Assert.assertTrue(actual);
//    }
    public void testHasBeenHarvest() {
        //Given
        Tomato objTomato=new Tomato();
        //when
        boolean actual= objTomato.hasBeenHarvest();
        //then
        Assert.assertTrue(actual);
    }
    public void testBeenEaten() {
        //Given
        Tomato objTomato=new Tomato();
        //when
        boolean actual= objTomato.beenEaten();
        //then
        Assert.assertTrue(actual);
    }

}