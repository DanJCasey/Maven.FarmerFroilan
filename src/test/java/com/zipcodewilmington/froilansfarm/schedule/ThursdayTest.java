package com.zipcodewilmington.froilansfarm.schedule;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Pilot;
import com.zipcodewilmington.froilansfarm.farmVehicle.Tractor;
import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import com.zipcodewilmington.froilansfarm.shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

public class ThursdayTest {
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
    public void toHarvestTest() {
        //given
        Tractor tractor = new Tractor(true, 10);
        Boolean expected = true;
        //when
        tractor.setToBeHarvested(true);
        Boolean actual = tractor.getToBeHarvested();
        //then
        Assert.assertEquals(expected, actual);
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
}
