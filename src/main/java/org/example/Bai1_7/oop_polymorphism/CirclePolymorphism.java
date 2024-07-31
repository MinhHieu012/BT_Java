package org.example.Bai1_7.oop_polymorphism;

import org.example.Bai1_7.Shape;

public class CirclePolymorphism extends Shape {
    double radius, diameter;

    // Khởi tạo constructor
    public CirclePolymorphism(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double area() {
        return 3.14 * ((diameter/2) * (diameter/2));
    }
}