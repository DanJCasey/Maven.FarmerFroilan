package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop <T extends Produce>{
    private boolean _hasBeenHarvest; //Parameter to define harvested or not
    //Getter
     public boolean is_hasBeenHarvest() { return _hasBeenHarvest;}
    //Setter
    public void set_hasBeenHarvest(boolean _hasBeenHarvest) {this._hasBeenHarvest = _hasBeenHarvest;}

    //Constructor with default value as false and without parameters
    public Crop() {
        this._hasBeenHarvest=false;
    }

    //Constructor with parameter
    public Crop(boolean _hasBeenHarvest) {
        this._hasBeenHarvest = _hasBeenHarvest;
    }
    //Method to set harvest variable
    public boolean harvest(){ return this._hasBeenHarvest=true;}
}
