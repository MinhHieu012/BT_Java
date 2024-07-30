package org.example.Bai_1.oop_extends;

import org.example.Bai_1.Shape;

public class Rectangle extends Shape {
    /**
     * CV = (cd + cr) * 2
     * DT = cd * cr
     */
    double cd, cr;

    public Rectangle(double cd, double cr) {
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
