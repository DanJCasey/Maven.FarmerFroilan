package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse extends Shelter<Farmer> {
    private List<Farmer> listFarmers = new ArrayList<>();
    public List<Farmer> getListFarmers() {
        return listFarmers;
    }
    public FarmHouse(){

    }
    public FarmHouse(List<Farmer> listFarmers) {
        this.listFarmers = listFarmers;
    }
    @Override
    public void addToStorage(Farmer item) {
        this.listFarmers.add(item);

    }



    @Override
    public void addToStorage(List<Farmer> toBeStored) {
        this.listFarmers = toBeStored;

    }
}
