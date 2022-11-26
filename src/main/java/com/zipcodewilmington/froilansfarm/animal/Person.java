package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person extends Animal implements Eater<Produce>, Botanist, Rider {
    public Person(String name, int age) {
        super(name, age);
    }

    public void eat() {}
    public static boolean fed(){
        return false;
    }
    public static boolean isRiding() {
        return false;
    }

}
