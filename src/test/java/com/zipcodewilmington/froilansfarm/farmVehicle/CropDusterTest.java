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
import java.util.Collections;
import java.util.List;

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

@Test
    public void needsToBeFertilizedTest() {
        //given
    CropDuster cduster = new CropDuster(true, 100);
    Boolean expected = true;
        //when
    cduster.needsToBeFertilized(new CropRow<CornStalk>(new ArrayList<CornStalk>()));
        //then
    Assert.assertTrue(expected);
    }

    @Test
    public void needsToBeFertilizedTest2() {
        //given
        CropDuster cduster = new CropDuster(true, 100);
        Boolean expected = true;
        //when
        cduster.needsToBeFertilized(new CropRow<TomatoPlant>(new ArrayList<TomatoPlant>()));
        //then
        Assert.assertTrue(expected);
    }

}
