package com.zipcodewilmington.froilansfarm.farmVehicle;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.field.CornRow;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.produce.Corn;

import java.util.ArrayList;

import java.util.List;

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


//    public boolean needsToBeHarvestedCorn(CornRow cornRow) {
//        for (Crop crop : cornRow.getList()) {
//            if (crop.is_hasBeenHarvest() == false) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean needsToBeHarvestedTomato(TomatoRow tomatoRow) {
//        for (Crop crop : tomatoRow.getList()) {
//            if (crop.is_hasBeenHarvest() == false) {
//                return true;
//            }
//        }
//        return false;
//    }

    public void ride() {

    }
}
