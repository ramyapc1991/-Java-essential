package com.java.lambda.unit3;

import com.java.lambda.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Ramya","PC", 29),
                new Person("Sanketh", "CR", 31),
                new Person("Dhanvi", "C Sanketh", 2),
                new Person("Sample", "Name", 0)

        );

        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        System.out.println("Using for in loop");
        for(Person p: people){
            System.out.println(p);
        }
        System.out.println("Using lambda for each loop");
        people.forEach(p -> System.out.println(p));
        System.out.println("Using lambda for each loop method reference approach ");
        people.forEach(System.out::println);
    }
}
