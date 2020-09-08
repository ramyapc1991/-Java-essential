package com.java.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Ramya","PC", 29),
                new Person("Sanketh", "CR", 31),
                new Person("Dhanvi", "C Sanketh", 2),
                new Person("Sample", "Name", 0)

        );

        //Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo( o2.getLastName());
            }
        });

        //Step 2: Create method that prints all the element in list
        printAllPeople(people);

        //Step 3: Create a method that prints all people that have last name beginning with C
        printLastNameBeginningWithC(people);

        System.out.println("Last Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, new ConditionCheck() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }

        });
        System.out.println("First Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, new ConditionCheck() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("S");
            }

        });

    }

    private static void printConditionally(List<Person> people, ConditionCheck c) {
        for(Person p:people){
            if(c.test(p)){
                System.out.println(p);
            }
        }
        System.out.println();
    }

    private static void printLastNameBeginningWithC(List<Person> people) {
        System.out.println("Last Name Starts with C");
        System.out.println("-----------------------");
        for(Person p:people){
            if(p.getLastName().startsWith("C")){
                System.out.println(p);
            }
        }
        System.out.println();
    }

    private static void printAllPeople(List<Person> people) {
        System.out.println("List of Person");
        System.out.println("--------------");
        for(Person p:people){
            System.out.println(p);
        }
        System.out.println();
    }
}

interface ConditionCheck{
    boolean test(Person p);

}
