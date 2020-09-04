package com.java.lambda;

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

        MyLambda helloWorldMsg = () -> System.out.println("Hello World from Lambda expression");
        helloWorldMsg.foo();
        AddNumber addNumber = (int a, int b) -> a+b;
        System.out.println("adding is "+addNumber.add(5,6));
    }
}

interface MyLambda{
 void foo();
}

interface AddNumber{
    int add(int x, int y);
}
