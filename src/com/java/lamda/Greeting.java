package com.java.lamda;

public class Greeting {

    void greet(Greet greet){
       // System.out.println("Hello world from greet() method");
        greet.perform();
    }

    public static void main(String args[]){
       // System.out.println("Hello world! from main method");
        Greeting greeting = new Greeting();
        HelloWorldGreet greet = new HelloWorldGreet();
        greeting.greet(greet);
    }
}
