package com.company.z2;

public class Hand {
    private int wristCircle;

    public Hand(int wristCircle) {
        this.wristCircle = wristCircle;
    }

    public int getWristCircle() {
        return wristCircle;
    }

    public void setWristCircle(int wristCircle) {
        this.wristCircle = wristCircle;
    }

    public void out() {
        System.out.println("I have " + wristCircle + " wrist circe.");
    }
}
