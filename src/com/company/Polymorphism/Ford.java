package com.company.Polymorphism;

public class Ford extends Car {



    public Ford(int cylinder, String name) {
        super(cylinder, name);
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
