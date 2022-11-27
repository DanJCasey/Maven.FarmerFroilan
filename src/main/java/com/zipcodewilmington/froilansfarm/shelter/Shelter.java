package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Storage;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter <T extends Animal>{

    public abstract void addToStorage(T item) ;

    public abstract void addToStorage(List<T> toBeStored) ;

}
