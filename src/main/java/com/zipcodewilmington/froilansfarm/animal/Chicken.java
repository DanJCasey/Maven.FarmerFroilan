package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Eater<Produce>, NoiseMaker {

    public Chicken(){super();}
    public Chicken(String name, int age) {
        super(name, age);
    }
    public void eat() {}
    public static boolean fed(){return false;}
    public static String makeNoise() {return "Cluck!";}
}
