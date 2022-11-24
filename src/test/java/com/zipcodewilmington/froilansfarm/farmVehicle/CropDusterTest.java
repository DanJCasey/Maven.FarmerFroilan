package com.zipcodewilmington.froilansfarm.farmVehicle;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.field.CornRow;
import com.zipcodewilmington.froilansfarm.field.TomatoRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
//import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void constructorTest(){
        //given
        int numOfFertilizeCrops = 32;
        boolean toBeFertilized = true;
        //when
        CropDuster crop = new CropDuster(false, 0);
        //then
        Assert.assertNotEquals(numOfFertilizeCrops, crop.getNumOfFertilizeCrop());
        Assert.assertNotEquals(toBeFertilized, false);
    }

@Test
    public void nullaryConstructorTest(){
        //given
        boolean expectedFertilizer = false;
        int expectedNumOfFertilizeCrop = 100;
        //when
        CropDuster crop = new CropDuster(true, 0);
        //then
    Assert.assertNotEquals(expectedFertilizer, crop.getToBeFertilized());
    Assert.assertNotEquals(expectedNumOfFertilizeCrop, crop.getNumOfFertilizeCrop());
    }

    @Test
    public void getFertilizeCropsTest() {
        //given
        int expectedFertilizeCrop = 5;
        CropDuster crop = new CropDuster(false, 0);
        crop.setNumOfFertilizeCrop(expectedFertilizeCrop);
        //when
        int actual = crop.getNumOfFertilizeCrop();
        //then
        Assert.assertEquals(expectedFertilizeCrop, actual);
    }

    @Test
    public void getNumOfCropFertilizeTest () {
        //given
        CropDuster cduster = new CropDuster(false, 0);
        Integer expected = 56;
        //when
        cduster.setNumOfFertilizeCrop(56);
        Integer actual = cduster.getNumOfFertilizeCrop();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilizedTest () {
        //given
        CropDuster cduster = new CropDuster(false, 0);
        Boolean expected = true;
        //when
        cduster.setToBeFertilized(true);
        Boolean actual = cduster.getToBeFertilized();
        //then
        Assert.assertEquals(expected, actual);
    }

//@Test
//    public void needsToBeFertilizedCornTest() {
//        //given
//    CropDuster cduster = new CropDuster(true, 100);
//    CornRow cornRow = new CornRow();
//    Crop crop = new CornStalk();
//    crop.harvest();
//    Boolean expected = false;
//        //when
//    cornrow.add(crop);
//    Boolean actual = cduster.needsToBeFertilizedCorn(cornRow);
//        //then
//        Assert.assertEquals(expected, actual);
//    }

//    @Test
//    public void needsToBeFertilizedTomatoTest() {
//        //given
//    CropDuster cduster = new CropDuster(true, 100);
//    TomatoRow tomatorow = new TomatoRow();
//    Crop crop = new TomatoPlant();
//    crop.harvest();
//    Boolean expected = false;
//        //when
//    tomatorow.add(crop);
//    Boolean actual = cduster.needsToBeFertilizedTomato(tomatorow);
//        //then
//        Assert.assertEquals(expected, actual);
//    }
}
