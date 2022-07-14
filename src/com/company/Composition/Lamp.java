package com.company.Composition;

public class Lamp {

    private String style;
    private Boolean battery;
    private int globRating;

    public Lamp(String style, Boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }


    public void turnOn() {
        System.out.println("Lamp is turned on");
    }


    public String getStyle() {
        return style;
    }

    public Boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }







}
