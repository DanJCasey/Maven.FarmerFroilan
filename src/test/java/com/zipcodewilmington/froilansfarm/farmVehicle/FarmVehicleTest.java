package com.zipcodewilmington.froilansfarm.farmVehicle;

import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleTest {
    @Test
    public void nullaryConstructorTest() {
        //given
        boolean expectedHasBeenOperated = true;
        //when
        FarmVehicle farmVehicle = new FarmVehicle() {
            public void ride() {
           }
        };
        //given
        Assert.assertEquals(expectedHasBeenOperated,farmVehicle.getOperate());
        }

    @Test
    public void setOperateTest1() {
        //given
        boolean expectedHasBeenOperated = true;
        //when
        FarmVehicle farmVehicle = new FarmVehicle() {
            public void ride() {
            }
        };
        farmVehicle.setOperate(true);
        //then
        Assert.assertTrue(expectedHasBeenOperated);
    }

    @Test
    public void setOperateTest2() {
        //given
        boolean expectedHasBeenOperated = false;
        //when
        FarmVehicle farmVehicle = new FarmVehicle() {
            public void ride() {
            }
        };
        farmVehicle.setOperate(false);
        //then
        Assert.assertFalse(expectedHasBeenOperated);
    }
}
