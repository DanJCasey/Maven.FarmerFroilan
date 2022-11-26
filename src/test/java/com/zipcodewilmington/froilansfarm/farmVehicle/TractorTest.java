package com.zipcodewilmington.froilansfarm.farmVehicle;

//import junit.framework.TestCase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TractorTest {
    @Test
    public void constructorTest() {
        //given
        int numOfHarvestCrops = 100;
        boolean toBeHarvested = true;
        //when
        Tractor crop = new Tractor(false, 0);
        //then
        Assert.assertNotEquals(numOfHarvestCrops, crop.getNumOfHarvestCrop());
        Assert.assertNotEquals(toBeHarvested, false);
    }

    @Test
    public void nullaryConstructorTest() {
        //given
        boolean expectedHarvested = true;
        int expectedNumOfHarvestCrop = 34;
        //when
        Tractor crop = new Tractor(false, 0);
        //then
        Assert.assertNotEquals(expectedHarvested, crop.getToBeHarvested());
        Assert.assertNotEquals(expectedNumOfHarvestCrop, crop.getNumOfHarvestCrop());
    }

    @Test
    public void getHarvestCropsTest() {
        //given
        int expectedHarvestCrop = 5;
        Tractor crop = new Tractor(false, 0);
        crop.setNumOfHarvestCrop(expectedHarvestCrop);
        //when
        int actual = crop.getNumOfHarvestCrop();
        //then
        Assert.assertEquals(expectedHarvestCrop, actual);
    }

    @Test
    public void getNumOfCropHarvestTest () {
        //given
        Tractor tractor = new Tractor(false, 0);
        Integer expected = 56;
        //when
        tractor.setNumOfHarvestCrop(56);
        Integer actual = tractor.getNumOfHarvestCrop();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest () {
        //given
        Tractor tractor = new Tractor(false, 0);
        Boolean expected = true;
        //when
        tractor.setToBeHarvested(true);
        Boolean actual = tractor.getToBeHarvested();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void needsToBeHarvestedTest() {
        //given
        Tractor tractor = new Tractor(true, 100);
        Boolean expected = true;
        //when
        tractor.needsToBeHarvested(new CropRow<CornStalk>(new ArrayList<CornStalk>()));
        //then
        Assert.assertTrue(expected);
    }

    @Test
    public void needsToBeHarvestedTest2() {
        //given
        Tractor tractor = new Tractor(true, 100);
        Boolean expected = true;
        //when
        tractor.needsToBeHarvested(new CropRow<TomatoPlant>(new ArrayList<TomatoPlant>()));
        //then
        Assert.assertTrue(expected);
    }
}
