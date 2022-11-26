package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.farmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Animal implements Rider<CropDuster> {
    public Pilot(String name, int age) {
        super(name, age);
    }
    public void eat() {}
    public static boolean fed(){return false;}
    public static boolean isRiding() {
        return false;
    }
}
