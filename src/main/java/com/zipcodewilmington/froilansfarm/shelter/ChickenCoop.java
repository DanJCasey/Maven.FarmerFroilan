package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Chicken;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {
    private List<Chicken> listChickens = new ArrayList<>();

    public  List<Chicken>  getListChickens() {
        return listChickens;
    }
    public ChickenCoop(){

    }
    public ChickenCoop(List<Chicken> listChickens) {
        this.listChickens = listChickens;
    }
    @Override
    public void addToStorage(Chicken item) {
        this.listChickens.add(item);

    }

    @Override
    public void addToStorage(List<Chicken> toBeStored) {
        this.listChickens = toBeStored;

    }
}
