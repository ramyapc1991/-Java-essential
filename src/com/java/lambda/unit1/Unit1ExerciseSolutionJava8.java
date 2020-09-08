package com.java.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Ramya","PC", 29),
                new Person("Sanketh", "CR", 31),
                new Person("Dhanvi", "C Sanketh", 2),
                new Person("Sample", "Name", 0)

        );

        //Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create method that prints all the element in list
       // printAllPeople(people);
        printConditionally(people, p ->true);

        //Step 3: Create a method that prints all people that have last name beginning with C

        System.out.println("Last Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        System.out.println("First Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, p -> p.getFirstName().startsWith("R"));

    }

    private static void printConditionally(List<Person> people, ConditionCheck conditionCheck) {
        for(Person p:people){
            if(conditionCheck.test(p)){
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
