package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.produce.Tomato;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop<Tomato> {
    private List<Tomato> lstTomatoes=new ArrayList<Tomato>(); //Assuming tomato plant yields multiple tomatoes

    public List<Tomato> getTomatoes() {return lstTomatoes;} //Getter
    public void setTomatoes(List<Tomato> tomatoes) {this.lstTomatoes = tomatoes;}//Setter
    //Constructor to set Crop _hasBeenHarvest value and passsing set of tomatoes
    public TomatoPlant(boolean _hasBeenHarvest, List<Tomato> tomatoes) {
        super(_hasBeenHarvest);
        this.lstTomatoes = tomatoes;
    }
    //Constructor when passing only list of tomatoes
    public TomatoPlant(List<Tomato> tomatoes) {
        this.lstTomatoes = tomatoes;
    }
    public TomatoPlant() {      //Nullary Constructor
    }
    // Method to add tomatoes to the list when harvested
    public void yield(){
        if(is_hasBeenHarvest()==true)
            lstTomatoes.add(new Tomato());
    }
}
