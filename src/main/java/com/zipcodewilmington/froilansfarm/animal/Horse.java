package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Eater<Produce>, Rideable, NoiseMaker {
    public Horse(String name, int age) {
        super(name, age);
    }

    public void eat(Produce food) {stomach.add(food);}

    public static boolean fed(){return !stomach.isEmpty();}


    public static String makeNoise() {
        return "Neigh!";
    }

    public static boolean beingRid(){
        return true;
    }
}
