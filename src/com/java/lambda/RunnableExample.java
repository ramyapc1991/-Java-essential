package com.java.lambda;

public class RunnableExample {
    public static void main(String[] args){
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside run() method");
            }
        });

        myThread.run();

        Thread myLambda = new Thread( () ->  System.out.println("Printed inside lambda function"));
        myLambda.run();
    }
}
