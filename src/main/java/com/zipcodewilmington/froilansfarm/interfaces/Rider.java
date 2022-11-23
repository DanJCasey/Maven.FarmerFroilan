package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider <FarmVehicle extends Rideable> {
    void mount();
    void dismount();
}
