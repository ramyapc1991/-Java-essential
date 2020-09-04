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

        Greet helloWorldMsg = () -> System.out.println("Hello World from Lambda expression");
        greeting.greet(helloWorldMsg);
        greeting.greet(() -> System.out.println("Hello World from Lambda expression inline "));
        AddNumber addNumber = (int a, int b) -> a+b;
        System.out.println("addition is "+ addNumber.add(5,6));


        Greet innerClassGreet = new Greet() {
            @Override
            public void perform() {
                System.out.println("Hello world from inner class");
            }
        };
        greeting.greet(innerClassGreet);
    }
}

interface MyLambda{
 void foo();
}

interface AddNumber{
    int add(int x, int y);
}
