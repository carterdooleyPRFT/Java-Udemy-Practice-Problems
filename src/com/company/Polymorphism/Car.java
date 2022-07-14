package com.company.Polymorphism;

import java.awt.desktop.SystemEventListener;

public class Car {

    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;


    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        String returnString = this.getClass().getSimpleName() + " engine is starting";
        return returnString;
    }

    public String accelerate() {
        String returnString = this.getClass().getSimpleName() + " is accelerating";
        return returnString;
    }

    public String brake() {
        String returnString = this.getClass().getSimpleName() + " is braking";
        return returnString;
    }

}
