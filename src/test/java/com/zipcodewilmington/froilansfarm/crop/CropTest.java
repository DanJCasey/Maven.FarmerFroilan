package com.zipcodewilmington.froilansfarm.crop;

import junit.framework.TestCase;
import org.junit.Assert;

public class CropTest extends TestCase {
    private Crop crop;
    public void setUp(){
        crop=new Crop() {
        };
    }
    public void testIs_hasBeenHarvest1() {
        crop.set_hasBeenHarvest(true);
        Assert.assertTrue(crop.is_hasBeenHarvest());
    }
    public void testIs_hasBeenHarvest2() {
        crop.set_hasBeenHarvest(false);
        Assert.assertFalse(crop.is_hasBeenHarvest());
    }
    public void testSet_hasBeenHarvest() {
        //Given
        boolean expected=true;
        //When
        crop.set_hasBeenHarvest(true);
        boolean actual=crop.is_hasBeenHarvest();
        //Then
        Assert.assertTrue(actual);
    }
    public void testHarvest() {
        //Given
        boolean expected=true;
        //when
        boolean actual=crop.harvest();
        //Then
        Assert.assertEquals(expected,actual);
    }
}