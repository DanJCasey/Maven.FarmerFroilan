package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Tomato implements Produce {
    public boolean beenEaten() {
        return true;
    }

    public boolean hasBeenHarvest() {
        return true;
    }
}
