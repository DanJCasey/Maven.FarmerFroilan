package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider <FarmVehicle extends Rideable> {
    public static boolean isRiding() {
        return false;
    }
}
