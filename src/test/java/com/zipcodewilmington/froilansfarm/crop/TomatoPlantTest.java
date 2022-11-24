package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.produce.Tomato;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlantTest extends TestCase {

    public void testGetTomatoes() {
        //Given
        Tomato objTomato=new Tomato();
        List<Tomato> expected=new ArrayList<Tomato>();
        expected.add(objTomato);
        TomatoPlant objTomatoPLant=new TomatoPlant(true,expected);
        //When
        List<Tomato> actual=objTomatoPLant.getTomatoes();
        //Then
        Assert.assertEquals(expected,actual);

    }
    public void testSetTomatoes() {
        //Given
        Tomato objTomato=new Tomato();
        List<Tomato> expected=new ArrayList<Tomato>();
        expected.add(objTomato);
        TomatoPlant objTomatoPLant=new TomatoPlant();
        //When
        objTomatoPLant.setTomatoes(expected);
        List<Tomato> actual=objTomatoPLant.getTomatoes();
        //Then
        Assert.assertEquals(expected,actual);
    }

    public void testYield() {
        //Given
        Tomato objTomato=new Tomato();
        List<Tomato> expected=new ArrayList<Tomato>();
        TomatoPlant objTomatoPlant=new TomatoPlant(true,expected);
        //When
        objTomatoPlant.yield();
        List<Tomato> actual=objTomatoPlant.getTomatoes();
        Assert.assertEquals(expected,actual);

    }
}