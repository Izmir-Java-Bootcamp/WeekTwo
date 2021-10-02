package com.kodluyoruz.generics.model;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this("white", false, radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
