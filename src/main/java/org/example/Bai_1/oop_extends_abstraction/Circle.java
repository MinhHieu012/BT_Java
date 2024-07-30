package org.example.Bai_1.oop_extends_abstraction;

import org.example.Bai_1.Shape;

public class Circle extends Shape {
    /**
     * CV = 2 * 3.14 * radius (bán kinh)
     * DT = 3.14 * (duong_kinh/2)^2
     */
    double radius, diameter;

    // Khởi tạo constructor
    public Circle(double radius, double diameter) {
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
