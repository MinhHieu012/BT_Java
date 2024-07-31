package org.example.Bai1_7.oop_encapsulation;

public class RectangleEncapsulation {
    double cd, cr;

    public RectangleEncapsulation(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double perimeter() {
        return (cd + cr) * 2;
    }

    public double area() {
        return cd * cr;
    }
}
