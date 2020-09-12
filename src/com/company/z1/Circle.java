package com.company.z1;

public class Circle {
    double radius;
    double x_center;
    double y_center;

    public Circle() {}

    public Circle(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX_center(double x_center) {
        this.x_center = x_center;
    }

    public void setY_center(double y_center) {
        this.y_center = y_center;
    }

    public double getRadius() {
        return radius;
    }

    public double getX_center() {
        return x_center;
    }

    public double getY_center() {
        return y_center;
    }
}
