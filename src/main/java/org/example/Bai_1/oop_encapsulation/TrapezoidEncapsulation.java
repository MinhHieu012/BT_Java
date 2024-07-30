package org.example.Bai_1.oop_encapsulation;

public class TrapezoidEncapsulation {
    double a, b, c, d, h;

    // Khởi tạo constructor
    public TrapezoidEncapsulation(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public double perimeter() {
        return a + b + c + d;
    }

    public double area() {
        return ((a + b) * h) / 2;
    }
}
