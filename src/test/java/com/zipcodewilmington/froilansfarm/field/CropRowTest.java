package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CropRowTest extends TestCase {

    public void testGetLstCrops() {
        //Given
        List<Crop> lstCropExpected=new ArrayList<Crop>();
        lstCropExpected.add(new TomatoPlant(new ArrayList<Tomato>()));
        lstCropExpected.add(new CornStalk(new ArrayList<Corn>()));
        CropRow objCropRow=new CropRow(lstCropExpected);
        //When
        List<Crop> lstCropActual=  objCropRow.getLstCrops();
       // Then
        Assert.assertEquals(lstCropExpected,lstCropActual);
    }

    public void testSetLstCrops() {
        //Given
        List<Crop> lstCropExpected=new ArrayList<Crop>();
        CropRow objCropRow=new CropRow(lstCropExpected);
        //When
        lstCropExpected.add(new TomatoPlant(new ArrayList<Tomato>()));
        lstCropExpected.add(new CornStalk(new ArrayList<Corn>()));
        objCropRow.setLstCrops(lstCropExpected);
        //Then
        Assert.assertEquals(lstCropExpected,objCropRow.getLstCrops());
    }

    public void testAddCrop() {
        //Given
       List<Crop> lstCrop=new ArrayList<Crop>();
        CropRow objCropRow=new CropRow(lstCrop);
        TomatoPlant objTomatoCrop=new TomatoPlant(new ArrayList<Tomato>());
        CornStalk objCornStalkCrop=new CornStalk(new ArrayList<Corn>());
        //When
        objCropRow.addCrop(objTomatoCrop);
        objCropRow.addCrop(objCornStalkCrop);
        //Then
        Assert.assertEquals(objTomatoCrop,objCropRow.getLstCrops().get(0));
        Assert.assertEquals(objCornStalkCrop,objCropRow.getLstCrops().get(1));
    }

}