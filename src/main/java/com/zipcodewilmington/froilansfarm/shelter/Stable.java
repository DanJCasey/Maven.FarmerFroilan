package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.produce.Tomato;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter<Horse>{
    private List<Horse> _lstHorses=new ArrayList<>();

    public List<Horse> getLstHorses() {
        return _lstHorses;
    }

    public void setLstHorses(List<Horse> lstHorses) {
        this._lstHorses = lstHorses;
    }

    public Stable() {

    }
    public Stable(List<Horse> lstHorses) {
        this._lstHorses=lstHorses;

    }
    @Override
    public void addToStorage(Horse item) {
        this._lstHorses.add(item);
    }

    @Override
    public void addToStorage(List<Horse> toBeStored) {
        this._lstHorses=toBeStored;

    }
}

