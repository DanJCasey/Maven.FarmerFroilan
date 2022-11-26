package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.farmVehicle.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Animal implements Rider<Tractor> {
    public Farmer(String name, int age) {
        super(name, age);
    }
    public void eat() {}
    public static boolean fed(){return false;}
    public static boolean isRiding() {
        return false;
    }
}
