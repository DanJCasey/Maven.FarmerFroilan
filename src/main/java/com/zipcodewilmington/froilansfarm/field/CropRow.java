package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.List;

public class CropRow<T extends Crop> {
    //Parameter to store list of crop.As CropRow consists og multiple CRops
    private List<T> lstCrops;
    public List<T> getLstCrops() {return lstCrops;} //Getter for parameter
    public void setLstCrops(List<T> lstCrops) {this.lstCrops = lstCrops;} //Setter for paramter
    //Constructor
    public CropRow(List<T> lstCrops) {
        this.lstCrops = lstCrops;
    }
    //Method to add crop to the CropsList.
    public void addCrop(T crop){
        lstCrops.add(crop);
    }

}
