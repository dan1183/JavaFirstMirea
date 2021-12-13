package ru.mirea.task17;

import java.util.Scanner;

enum Planet {
    Mercury(2.4, 3.3,0.3770),
    Venus(6.1, 0.81, 0.905),
    Earth(6.4, 1, 1),
    Mars(3.4, 0.11, 0.2795),
    Jupiter(71, 318, 2.64),
    Saturn(60, 95.3, 1.138),
    Uranus(26, 14.6, 0.917),
    Neptune(25, 17.28, 1.148);
    private final double radius;
    private final double mass;
    private final double forceOfGravity;

    Planet(double radius, double mass, double forceOfGravity) {
        this.radius = radius;
        this.mass = mass;
        this.forceOfGravity = forceOfGravity;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getForceOfGravity() {
        return forceOfGravity;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the number of planets:");
        Planet[] planets = Planet.values();
        for (int i = 0; i < planets.length; i++) {
            System.out.println(i + ") " + planets[i]);
        }

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Result: " + planets[number].getForceOfGravity());
    }
}
