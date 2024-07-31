package org.example.Bai1_7.oop_extends_abstraction;

import org.example.Bai1_7.Shape;

public class Square extends Shape {
    /**
     * CV = 4 * edge (cạnh)
     * DT = edge * edge
     */
    double edge;

    // Khởi tạo constructor
    public Square(double edge) {
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
