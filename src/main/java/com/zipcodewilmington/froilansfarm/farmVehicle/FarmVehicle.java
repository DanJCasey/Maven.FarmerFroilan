package com.zipcodewilmington.froilansfarm.farmVehicle;

import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.List;
//<Rider extends Person>
public abstract class FarmVehicle implements Rideable {
    private boolean hasBeenOperated;

    public FarmVehicle() {
        this.hasBeenOperated = true;
    }

    public FarmVehicle(boolean hasBeenOperated) {
        this.hasBeenOperated = hasBeenOperated;
    }
    public boolean getOperate() {
        return hasBeenOperated;
    }

    public void setOperate(boolean hasBeenOperated) {
        this.hasBeenOperated = hasBeenOperated;
    }
}
