package com.zipcodewilmington.froilansfarm.farmVehicle;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;

public class CropDuster extends FarmVehicle implements Aircraft {
    boolean toBeFertilized;
    int numOfCropFertilize;

    public CropDuster(boolean toBeFertilized, int numOfCropFertilize) {
        this.toBeFertilized = toBeFertilized;
        this.numOfCropFertilize = numOfCropFertilize;
    }

    public boolean getToBeFertilized() {
        return toBeFertilized;
    }

    public void setToBeFertilized(boolean toBeFertilized) {
        this.toBeFertilized = toBeFertilized;
    }

    public void setNumOfFertilizeCrop(int numOfCropFertilize) {
        this.numOfCropFertilize = numOfCropFertilize;
    }

    public int getNumOfFertilizeCrop() {
        return this.numOfCropFertilize;
    }

    public boolean needsToBeFertilized(CropRow cr) {
        for (Object cropRow : cr.getLstCrops()) {
            if (cropRow.equals(true)) {
                return true;
            }
        }
        return false;
    }


    public void fly() {

    }

    public void ride() {

    }
}
