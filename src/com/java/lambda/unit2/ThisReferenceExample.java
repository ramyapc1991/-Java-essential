package com.java.lambda.unit2;

public class ThisReferenceExample {

    public static void main(String[] args){
        ThisReferenceExample referenceExample = new ThisReferenceExample();
//        referenceExample.doProcess(10, i -> {
//            System.out.println("Value of i "+i);
//           // System.out.println(this); This not work
//        });

        referenceExample.execute();
    }
    public static void doProcess(int i,Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i "+i);
            System.out.println(this);
        });
    }

    public String toString(){
        return "This is the main ThisReferenceExample reference";
    }
}
