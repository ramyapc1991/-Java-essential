package com.java.lambda.unit3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args){
        List<Integer> number = Arrays.asList(2,3,4,5);
        //map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names =Arrays.asList("Reflection","Collection","Java", "JavaScript","Stream");
        //filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //Sorted method
        List<String> sort = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        // create a list of integers
        List<Integer> newNum = Arrays.asList(2,3,4,5,6);

        //collect method return to set
        Set<Integer> squareSet = newNum.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        //foreach method
        number.stream().map(x -> x*x).forEach(y -> System.out.println(y));

        //reduce method
        int even = number.stream().filter(x -> x%2==0).reduce(0, (ans, i)-> ans+i);
        System.out.println("reduce");
        System.out.println(even);
    }
}
