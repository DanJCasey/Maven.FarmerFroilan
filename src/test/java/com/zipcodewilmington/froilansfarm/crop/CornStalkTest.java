package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CornStalkTest extends TestCase {

    public void testGetCornStalk() {
        //Given
        Corn objCorn=new Corn();
        List<Corn> expected=new ArrayList<Corn>();
        expected.add(objCorn);
        CornStalk objCornStalk=new CornStalk(true,expected);
        //When
        List<Corn> actual=objCornStalk.getCornStalk();
        //Then
        Assert.assertEquals(expected,actual);
    }

    public void testSetCornStalk() {
        //Given
        Corn objCorn=new Corn();
        List<Corn> expected=new ArrayList<Corn>();
        expected.add(objCorn);
        CornStalk objCornStalk=new CornStalk();
        //When
        objCornStalk.setCornStalk(expected);
        List<Corn> actual=objCornStalk.getCornStalk();
        //Then
        Assert.assertEquals(expected,actual);
    }

    public void testYield() {
        //Given
        Corn objCorn=new Corn();
        List<Corn> expected=new ArrayList<Corn>();
        expected.add(objCorn);
        CornStalk objCornStalk=new CornStalk(true,expected);
        //When
        objCornStalk.yield();
        List<Corn> actual=objCornStalk.getCornStalk();
        Assert.assertEquals(expected,actual);
    }
}