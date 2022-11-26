package com.zipcodewilmington.froilansfarm.farmVehicle;
import com.zipcodewilmington.froilansfarm.field.CropRow;

public class Tractor extends FarmVehicle {
    boolean toBeHarvested;
    int numOfHarvestCrop;

    public Tractor(boolean toBeHarvested, int numOfHarvestCrop) {
        this.toBeHarvested = toBeHarvested;
        this.numOfHarvestCrop = numOfHarvestCrop;
    }

    public boolean getToBeHarvested() {
        return toBeHarvested;
    }

    public void setToBeHarvested(boolean toBeHarvested) {
        this.toBeHarvested = toBeHarvested;
    }


    public void setNumOfHarvestCrop(int numOfHarvestCrop) {
        this.numOfHarvestCrop = numOfHarvestCrop;
    }

    public int getNumOfHarvestCrop() {
        return this.numOfHarvestCrop;
    }

    public boolean needsToBeHarvested(CropRow cr) {
        for (Object croprow : cr.getLstCrops()) {
            if (croprow.equals(true)) {
                return true;
            }
        }
        return false;
    }

    public void ride() {

    }
}
