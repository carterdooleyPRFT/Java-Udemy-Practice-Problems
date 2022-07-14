package com.company.Circle;

public class Circle {


   private double radius;


    public Circle(double radius) {
        if (radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        double radi = getRadius();
        double answer = radi * radi * Math.PI;
        System.out.println(answer);
        return answer;
    }


}
