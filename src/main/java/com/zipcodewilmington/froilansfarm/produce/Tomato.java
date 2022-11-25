package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Tomato implements Produce {
//    private boolean eatable;   //properties of tomato
//    private boolean harvestable;
////Properties getters and setters
//    public boolean isEatable() {
//        return eatable;
//    }
//    public void setEatable(boolean eatable) {
//        this.eatable = eatable;
//    }
//
//    public boolean isHarvestable() {
//        return harvestable;
//    }
//    public void setHarvestable(boolean harvestable) {
//        this.harvestable = harvestable;
//    }
    //When Tomato object is created by default we are saying it is harvestable and eatble
    public Tomato() {
        //this.eatable=true;
       // this.harvestable=true;
    }
    public boolean beenEaten() {return true;}
    public boolean hasBeenHarvest() {
        return true;
    }
}
