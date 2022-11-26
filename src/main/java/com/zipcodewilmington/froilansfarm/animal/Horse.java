package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Eater<Produce>, Rideable, NoiseMaker {
    public Horse(String name, int age) {
        super(name, age);
    }

    public void eat() {}

    public static boolean fed(){
        return false;
    }

    public static String makeNoise() {
        return "Neigh!";
    }

    public static boolean beingRid(){
        return false;
    }
}
