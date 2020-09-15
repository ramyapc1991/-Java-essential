package com.java.lambda.unit3;

import com.java.lambda.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Ramya","PC", 29),
                new Person("Sanketh", "CR", 31),
                new Person("Dhanvi", "C Sanketh", 2),
                new Person("Sample", "Name", 0)

        );
        printConditionally(people, p ->true, System.out::println); // p -> method()
    }

    private static void printConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> consumer) {
        for(Person p:people){
            if(personPredicate.test(p)){
                consumer.accept(p);
            }
        }
        System.out.println();
    }
}
