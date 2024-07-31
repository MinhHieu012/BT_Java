package org.example.Bai1_7.oop_polymorphism;

import org.example.Bai1_7.Shape;

public class SquarePolymorphism extends Shape {
    double edge;

    // Khởi tạo constructor
    public SquarePolymorphism(double edge) {
        this.edge = edge;
    }

    @Override
    public double perimeter() {
        return 4 * edge;
    }

    @Override
    public double area() {
        return edge * edge;
    }
}
