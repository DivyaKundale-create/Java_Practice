package org.example.classes;

public class Singleton {

    //create private variable
    private static Singleton singleton =null;

    public String s;

    //private constructor
    private Singleton(){
        s = "Hello I am a string part of Singleton class";
    }

    //public static method to getInstance
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
            System.out.println("Singleton Created");
        }
        System.out.println("Singleton Used");
        return singleton;
    }

}
