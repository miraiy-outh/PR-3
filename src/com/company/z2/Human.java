package com.company.z2;

public class Human {
    private String name;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(String name, Head head, Hand hand, Leg leg) {
        this.name = name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    void out() {
        System.out.println("My name is " + name + ".");
    }
}
