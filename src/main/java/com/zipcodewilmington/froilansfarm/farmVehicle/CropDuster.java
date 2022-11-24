package com.zipcodewilmington.froilansfarm.farmVehicle;

import com.zipcodewilmington.froilansfarm.animal.Pilot;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.field.CornRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

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

    public void fly() {

    }

    public void ride() {

    }
}
