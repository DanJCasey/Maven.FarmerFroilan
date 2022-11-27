package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class StableTest extends TestCase {

    public void testAddToStorage() {
        //Given
        Stable objStable=new Stable();
        Horse objHorse=new Horse("name",10);
        //When
        objStable.addToStorage(objHorse);
        //Then
        Assert.assertEquals(objStable.getLstHorses().get(0),objHorse);

    }

    public void testTestAddToStorage() {
        //Given
        Stable objStable=new Stable();
        List<Horse> lstHorse=new ArrayList<>();
        int expected=5;
        lstHorse.add(new Horse("test1",1));
        lstHorse.add(new Horse("test2",5));
        lstHorse.add(new Horse("test3",10));
        lstHorse.add(new Horse("test4",12));
        lstHorse.add(new Horse("test5",4));
        //When
        objStable.addToStorage(lstHorse);
        //Then
        Assert.assertEquals(expected,objStable.getLstHorses().size());

    }
}