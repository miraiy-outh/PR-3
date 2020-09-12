package com.company.z1;

import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double x;
        double y;
        boolean state = true;
        Circle circle1;
        while (state != false) {
            state = scan.nextBoolean();
            if (state != false) {
                radius = scan.nextDouble();
                x = scan.nextDouble();
                y = scan.nextDouble();
                circle1 = new Circle(radius, x, y);
                System.out.printf("radius = " + circle1.getRadius() + " center position x = " +
                        circle1.getX_center() + " center position y = " + circle1.getY_center());
            }
        }
    }
}
