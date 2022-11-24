package com.zipcodewilmington.froilansfarm.farmVehicle;

//import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

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


//    @Test
//    public void needsToBeHarvestedCornTest() {
//    //given
//        Tractor tractor = new Tractor(true, 100);
//        CornRow cornrow = new CornRow();
//        Crop crop = new CornStalk();
//        crop.harvest();
//        Boolean expected = false;
////when
//        cornrow.add(crop);
//        Boolean actual = tractor.needsToBeHarvestedCorn(cornrow);
////then
//        Assert.assertEquals(expected, actual);
//    }

//    public void needsToBeHarvestedTomatoTest() {
    //given
//        Tractor tractor = new Tractor(true, 100);
//        TomatoRow tomatorow = new TomatoRow();
//        Crop crop = new TomatoPlant();
//        crop.harvest();
//        Boolean expected = false;
//when
//        tomatorow.add(crop);
//        Boolean actual = tractor.needsToBeHarvestedTomato(tomatorow);
//then
//        Assert.assertEquals(expected, actual);
//    }
}
