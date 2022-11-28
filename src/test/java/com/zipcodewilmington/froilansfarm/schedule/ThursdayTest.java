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

    @Test
    public void rideEachHorseTest() {
        Stable stable = new Stable();
        Horse lucky = new Horse("lucky", 7);
        Horse freedom = new Horse("freedom", 4);
        Horse lola = new Horse("lola", 4);
        Horse lillie = new Horse("lillie", 4);
        Horse fresser = new Horse("fresser", 4);
        Horse cheeky = new Horse("cheeky", 4);
        Horse cheesey = new Horse("cheesey", 4);
        Horse matte = new Horse("matte", 4);
        Horse lilac = new Horse("lilac", 4);
        Horse neigh = new Horse("neigh", 4);


        stable.addToStorage(lucky);
        stable.addToStorage(freedom);
        stable.addToStorage(lola);
        stable.addToStorage(lillie);
        stable.addToStorage(fresser);
        stable.addToStorage(cheeky);
        stable.addToStorage(cheesey);
        stable.addToStorage(matte);
        stable.addToStorage(lilac);
        stable.addToStorage(neigh);


        lucky.beingRid();
        freedom.beingRid();
        lola.beingRid();
        lillie.beingRid();
        fresser.beingRid();
        cheeky.beingRid();
        cheesey.beingRid();
        matte.beingRid();
        lilac.beingRid();
        neigh.beingRid();

        Assert.assertTrue(lucky.beingRid());
        Assert.assertTrue(freedom.beingRid());
        Assert.assertTrue(lola.beingRid());
        Assert.assertTrue(lillie.beingRid());
        Assert.assertTrue(fresser.beingRid());
        Assert.assertTrue(cheeky.beingRid());
        Assert.assertTrue(cheesey.beingRid());
        Assert.assertTrue(matte.beingRid());
        Assert.assertTrue(lilac.beingRid());
        Assert.assertTrue(neigh.beingRid());

    }
}
