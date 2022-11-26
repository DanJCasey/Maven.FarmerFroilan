package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Corn implements Edible, Produce {
    public boolean beenEaten() {
        return false;
    }

    public boolean hasBeenHarvest() {
        return false;
    }
}
