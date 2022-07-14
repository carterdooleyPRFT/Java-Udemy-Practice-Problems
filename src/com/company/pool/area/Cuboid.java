package com.company.pool.area;

public class Cuboid extends Rectangle{


    private double height;



    public Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0 ){
            height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double area = getArea();
        double height1 = getHeight();
        return area * height;
    }




}
