package com.allaboutjava.basicconcepts.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImportantStreamOperations {

  public static void main(String[] args) {
    IntStream.range(1, 3).forEach(System.out::println);

    IntStream.rangeClosed(1, 3).forEach(System.out::println);

    System.out.println(IntStream.range(1, 5).max());

    //converstion of primitive type to object type
    int[] a = new int[]{1, 2, 3, 4, 55};
    // option 1
    List<Integer> input = Arrays.stream(a).boxed().collect(Collectors.toList());
    input.forEach(System.out::println);
    // option 2
    List<Integer> input1 = IntStream.of(a).boxed().collect(Collectors.toList());
    input1.forEach(System.out::println);

    System.out.println(
        "Check if there is any number > 10 - " + input.stream().anyMatch(x -> x > 10));

    // Get max value from given inputs
    System.out.println("Max - " + input.stream().mapToInt(x -> x).summaryStatistics().getMax());
    // Alternatively
    System.out.println("Max - " + input.stream().mapToInt(x -> x).max());
    System.out.println("COnverting to string and filtering single digit numbers");
    input.stream().map(String::valueOf).filter(x -> x.length() > 1).forEach(System.out::println);

    //convert string arraty to integer and then find the max value
    String[] str = {"1", "2", "3"};
    System.out.println(
        Arrays.stream(str).map(Integer::parseInt).mapToInt(x -> x).summaryStatistics().getMax());

    //Optional
    List<Integer> input2 = new ArrayList<>();
    System.out.println(input2.stream().mapToInt(x->x).max());
  }

}
