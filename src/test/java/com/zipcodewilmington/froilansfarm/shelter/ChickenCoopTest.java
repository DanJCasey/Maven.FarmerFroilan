package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest extends TestCase {

    public void testAddStorage() {
        //given
        ChickenCoop objectCoop = new ChickenCoop();
        Chicken objectChicken = new Chicken("name", 5);

        //when
        objectCoop.addToStorage(objectChicken);
        //then
        Assert.assertEquals(objectCoop.getListChickens().get(0), objectChicken);
    }

    public void testAddStorage2() {
        //given
        ChickenCoop objectCoop = new ChickenCoop();
        List<Chicken> listChicken = new ArrayList<>();
        int expected = 3;
        listChicken.add(new Chicken("Frank", 1));
        listChicken.add(new Chicken("Donnie", 2));
        listChicken.add(new Chicken("Harold", 5));
        //when
        objectCoop.addToStorage(listChicken);
        //then
        Assert.assertEquals(expected, objectCoop.getListChickens().size());
    }

}