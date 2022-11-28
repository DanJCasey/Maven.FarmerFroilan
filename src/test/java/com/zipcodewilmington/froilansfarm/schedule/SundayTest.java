package com.zipcodewilmington.froilansfarm.schedule;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Pilot;
import com.zipcodewilmington.froilansfarm.farmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import com.zipcodewilmington.froilansfarm.shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SundayTest {
    @Test
    public void name() {
    }

    @Test
    public void froilanBreakfastTest() {
        Farmer Froilan = new Farmer("Froilan", 25);

        Froilan.eat(new Corn());

        Froilan.eat(new Tomato());
        Froilan.eat(new Tomato());

        Froilan.eat(new Egg());
        Froilan.eat(new Egg());
        Froilan.eat(new Egg());
        Froilan.eat(new Egg());
        Froilan.eat(new Egg());

        Assert.assertTrue(Froilan.fed());

    }

    @Test
    public void froilandaBreakfastTest() {
        Pilot Froilanda = new Pilot("Froilanda", 21);

        Froilanda.eat(new Corn());
        Froilanda.eat(new Corn());

        Froilanda.eat(new Tomato());

        Froilanda.eat(new Egg());
        Froilanda.eat(new Egg());

        Assert.assertTrue(Froilanda.fed());
    }

    @Test
    public void toFlyTest() {
        //given
        CropDuster cduster = new CropDuster(true, 120);
        Boolean expected = true;
        //when
        Boolean actual = cduster.fly();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void plantThreeCrops(){
        //Given
        Field objField=new Field();
        List<CropRow> lstCropRowsExpected=new ArrayList<>();
        CropRow expectedFirstCrop=new CropRow(objField.createTomatoCrop());
        CropRow expectedSecondCrop=new CropRow(objField.createCornStalkCrop());
        CropRow expectedThirdCrop=new CropRow(objField.createTomatoCrop());
        //When
        lstCropRowsExpected.add(expectedFirstCrop);
        lstCropRowsExpected.add(expectedSecondCrop);
        lstCropRowsExpected.add(expectedThirdCrop);
        //Then
        Assert.assertEquals(expectedFirstCrop,lstCropRowsExpected.get(0));
        Assert.assertEquals(expectedSecondCrop,lstCropRowsExpected.get(1));
        Assert.assertEquals(expectedThirdCrop,lstCropRowsExpected.get(2));

    }

    @Test
    public void feedEachHorseTest() {
        Stable stable = new Stable();
        Horse lucky = new Horse("lucky", 7);
        Horse freedom = new Horse("freedom", 4);

        stable.addToStorage(lucky);
        stable.addToStorage(freedom);

        lucky.eat(new Corn());
        lucky.eat(new Corn());
        lucky.eat(new Corn());
        freedom.eat(new Corn());
        freedom.eat(new Corn());
        freedom.eat(new Corn());

        Assert.assertTrue(lucky.fed());
        Assert.assertTrue(freedom.fed());

    }

    @Test
    public void rideEachHorseTest() {
        Stable stable = new Stable();
        Horse lucky = new Horse("lucky", 7);

        stable.addToStorage(lucky);

        lucky.beingRid();

        Assert.assertTrue(lucky.beingRid());
    }
}
