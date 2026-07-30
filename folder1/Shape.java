package org.example.classes;

public class Shape extends Color{
    int radius;

    Shape(String colour, int radius) {
        super(colour); //
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}
