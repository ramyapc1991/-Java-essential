package com.java.lambda.unit2;

import com.java.lambda.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {
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
        printConditionally(people, p ->true, p -> System.out.println(p));

        //Step 3: Create a method that prints all people that have last name beginning with C

        System.out.println("Last Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        System.out.println("First Name Starts with C from Condition check");
        System.out.println("---------------------------------------------");
        printConditionally(people, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> consumer) {
        for(Person p:people){
            if(personPredicate.test(p)){
                consumer.accept(p);
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
