package com.java.lambda.unit3;

import com.java.lambda.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Ramya","PC", 29),
                new Person("Sanketh", "CR", 31),
                new Person("Dhanvi", "C Sanketh", 2),
                new Person("Sample", "Name", 0)

        );

        people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p.getFirstName()));

//        Stream<Person> personStream =people.stream();
//        System.out.println(personStream);

        long count = people.stream().count();
        System.out.println(count);

        long count1 = people.stream().filter(p -> p.getLastName().startsWith("C")).count();
        System.out.println(count1);

        long count2 = people.parallelStream().filter(p -> p.getLastName().startsWith("C")).count();
        System.out.println(count2);
    }
}
