package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.produce.Corn;
import com.zipcodewilmington.froilansfarm.produce.Tomato;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop<Corn> {
    private List<Corn> _lstCornstalk=new ArrayList<Corn>(); //Assuming CornStalk yield multiple corn

    public List<Corn> getCornStalk() {return _lstCornstalk;} //Getter
    public void setCornStalk(List<Corn> lstCornStalk) {this._lstCornstalk = lstCornStalk;}//Setter
    //Constructor to set Crop _hasBeenHarvest value and passsing set of CornStalk
    public CornStalk(boolean _hasBeenHarvest, List<Corn> lstcornStalk) {
        super(_hasBeenHarvest);
        this._lstCornstalk = lstcornStalk;
    }
    //Constructor when passing only list of CornStalk
    public CornStalk(List<Corn> lstcornStalk) {
        this._lstCornstalk = lstcornStalk;
    }
    public CornStalk() {      //Nullary Constructor
    }

    // Method to add cornStalk to the list when harvested
    public void yield(){
        if(is_hasBeenHarvest()==true)
            this._lstCornstalk.add(new Corn());
    }
}
