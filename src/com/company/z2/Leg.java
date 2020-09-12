package com.company.z2;

public class Leg {
    private int legSize;

    public Leg(int legSize) {
        this.legSize = legSize;
    }

    public int getLegSize() {
        return legSize;
    }

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }

    void out() {
        System.out.println("I have " + legSize + " leg size.");
    }
}
