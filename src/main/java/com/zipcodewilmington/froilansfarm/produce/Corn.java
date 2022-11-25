package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Corn implements Produce {
    public Corn() {
    }
    public boolean beenEaten() {
        return true;
    }

    public boolean hasBeenHarvest() {
        return true;
    }
}
