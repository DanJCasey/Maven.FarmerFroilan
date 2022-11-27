package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Person;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class FarmHouseTest extends TestCase {

    public void testAddStorage() {
        //given
        FarmHouse objectHouse = new FarmHouse();
        Farmer objectFarmer = new Farmer("Froilan", 33);
        //when
        objectHouse.addToStorage(objectFarmer);
        //then
        Assert.assertEquals(objectHouse.getListFarmers().get(0), objectFarmer);
    }

    public void testAddStorage2() {
        //given
        FarmHouse objectHouse = new FarmHouse();
        List<Farmer> listFarmer = new ArrayList<>();
        int expected = 2;
        listFarmer.add(new Farmer("Froilan", 33));
        listFarmer.add(new Farmer("Froilanda", 30));
        //when
        objectHouse.addToStorage(listFarmer);
        //then
        Assert.assertEquals(expected, objectHouse.getListFarmers().size());
    }

}