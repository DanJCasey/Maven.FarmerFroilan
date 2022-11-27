package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.produce.Corn;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Eater<Produce> {

    String name;
    int age;

    public static List<Produce> stomach = new ArrayList<>();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(Produce food) {stomach.add(food);}

    public static boolean fed(){return !stomach.isEmpty();}
}
