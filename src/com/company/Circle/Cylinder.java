package com.company.Circle;

import com.company.Circle.Circle;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }


    public double getHeight() {
        return height;
    }



    public double getVolume () {
        double area = getArea();
        if (area < 0) {
            return 0;
        } else {
            return area * height;
        }
    }



}
