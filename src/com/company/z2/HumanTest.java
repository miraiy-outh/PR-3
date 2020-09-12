package com.company.z2;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("blue", "brown");
        Leg leg = new Leg(38);
        Hand hand = new Hand(17);
        Human human1 = new Human("Anna", head, hand, leg);
        human1.out();
        human1.getHead().out();
        human1.getHand().out();
        human1.getLeg().out();
    }
}
