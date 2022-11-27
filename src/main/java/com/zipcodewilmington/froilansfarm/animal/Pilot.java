package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.farmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Animal implements Rider<CropDuster> {
    public Pilot(String name, int age) {
        super(name, age);
    }
    public void eat(Produce food) {stomach.add(food);}

    public static boolean fed(){return !stomach.isEmpty();}

    public static boolean isRiding() {
        return false;
    }
}
