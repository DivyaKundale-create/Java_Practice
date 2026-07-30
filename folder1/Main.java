package org.example.classes;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        Shape shape = new Shape("Yellow",4);
        shape.getColor();
        System.out.println("area: " + shape.area());

//        The abstract class (color) contains both abstract and non-abstract methods.
//        The child class(shape) implements the abstract method while inheriting the normal method.
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an instance of abstract class.
//         Color b = new Color();

        //You can't use the new keyword to create a new Singleton because its constructor is intentionally marked private.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + singleton1.hashCode());
        System.out.println("Hashcode of y is "
                + singleton2.hashCode());
        System.out.println("Hashcode of z is "
                + singleton3.hashCode());

        // Condition check
        if (singleton1 == singleton2 && singleton2 == singleton3) {

            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        System.lineSeparator();
        ClassImplementsInterface classImplementsInterface = new ClassImplementsInterface();
        classImplementsInterface.display();
        classImplementsInterface.display1();
        NewInterface.display2();


    }
}
