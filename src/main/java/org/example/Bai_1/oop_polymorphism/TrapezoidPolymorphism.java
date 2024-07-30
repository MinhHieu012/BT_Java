package org.example.Bai_1.oop_polymorphism;

import org.example.Bai_1.Shape;

public class TrapezoidPolymorphism extends Shape {
    double a, b, c, d, h;

    // Khởi tạo constructor
    public TrapezoidPolymorphism(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }

    @Override
    public double area() {
        return ((a + b) * h) / 2;
    }
}
