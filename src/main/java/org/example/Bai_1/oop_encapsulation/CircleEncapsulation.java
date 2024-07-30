package org.example.Bai_1.oop_encapsulation;

public class CircleEncapsulation {
    double radius, diameter;

    public CircleEncapsulation(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public double area() {
        return 3.14 * ((diameter/2) * (diameter/2));
    }
}
