package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Tomato implements Edible, Produce {
    public boolean beenEaten() {
        return true;
    }

    public boolean hasBeenHarvest() {
        return true;
    }
}
