package org.example.classes;

//Abstract Class with Partial Abstraction
abstract class Color {

    String colour;

    //constructor
    Color(String colour){
    this.colour = colour;
    }

    //abstract method
    abstract double area();

    //concrete method
    void getColor()
    {
        System.out.println("Color: " + colour);
    }


}
