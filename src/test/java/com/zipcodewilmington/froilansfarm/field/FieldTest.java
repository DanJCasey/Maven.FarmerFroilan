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

public class FieldTest extends TestCase {

    public void testCreateField() {
        //Given
        List<CropRow> lstCropRows=new ArrayList<CropRow>();
        Field objField=new Field();
        int expected=5;
        //When
        lstCropRows=objField.createField();
        int actual=lstCropRows.size();
        //Then
        Assert.assertEquals(expected,actual);

    }

    public void testCreateTomatoCrop() {
        //Given
        List<Crop> lstTomatoPlants=new ArrayList<>();
        List<Tomato> lstTomato;
        TomatoPlant objTomatoCrop;
        int expectedSize=10;
        //When
        for(int i=0;i<10;i++) {
            lstTomato=new ArrayList<>();
            objTomatoCrop=new TomatoPlant(true,lstTomato);
            for(int j=0;j<10;j++) objTomatoCrop.yield();
            lstTomatoPlants.add(new TomatoPlant(true,lstTomato));
        }
        int actual=lstTomatoPlants.size();
        //Then
        Assert.assertEquals(expectedSize,actual);

    }

    public void testCreateCornStalkCrop() {
        //Given
        List<Crop>  lstCornStalk=new ArrayList<>();
        List<Corn> lstCorn;
        CornStalk objCornStalk;
        int expectedSize=10;
        //When
        for(int i=0;i<10;i++) {
            lstCorn=new ArrayList<>();
            objCornStalk=new CornStalk(true,lstCorn);
            for(int j=0;j<10;j++) objCornStalk.yield();
            lstCornStalk.add(new CornStalk(true,lstCorn));
        }
        int actual=lstCornStalk.size();
        //Then
        Assert.assertEquals(expectedSize,actual);

    }
}