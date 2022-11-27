package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.animal.Animal;

public interface Eater<FoodType extends Edible>{
    public void eat(Produce food);

    public static boolean fed(){return false;}
}
