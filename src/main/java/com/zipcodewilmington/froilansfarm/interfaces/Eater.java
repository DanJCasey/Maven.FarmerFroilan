package com.zipcodewilmington.froilansfarm.interfaces;

public interface Eater<FoodType extends Edible>{
    public void eat();

    public static boolean fed(){
        return false;
    }
}
