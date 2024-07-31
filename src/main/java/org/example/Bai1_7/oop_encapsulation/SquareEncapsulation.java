package org.example.Bai1_7.oop_encapsulation;

public class SquareEncapsulation {
    double edge;

    // Khởi tạo constructor
    public SquareEncapsulation(double edge) {
        this.edge = edge;
    }

    public double perimeter() {
        return 4 * edge;
    }

    public double area() {
        return edge * edge;
    }
}
