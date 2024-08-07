package org.example.Bai1_7.oop_polymorphism;

import org.example.Bai1_7.Shape;

public class RectanglePolymorphism extends Shape {
    double cd, cr;

    public RectanglePolymorphism(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double perimeter() {
        return (cd + cr) * 2;
    }

    @Override
    public double area() {
        return cd * cr;
    }
}
