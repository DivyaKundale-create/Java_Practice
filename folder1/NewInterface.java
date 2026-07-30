package org.example.classes;

public interface NewInterface {

    int a=10; //public static final by default

    void display(); // public abstract method

    default void display1(){  //default
        System.out.println("Default method");
    }

    static void display2(){
        System.out.println("Static method");
    }


}
