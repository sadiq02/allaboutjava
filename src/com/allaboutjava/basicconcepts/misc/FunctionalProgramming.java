package com.allaboutjava.basicconcepts.misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming {

  public static void main(String[] args) {
    int a[] = new int[]{33, 11, 77, 55, 22};
    List<Integer> input = IntStream.of(a).boxed().collect(Collectors.toList());
    input.forEach(System.out::println);

    System.out.println(
        "Largest element - " + input.stream().mapToInt(x -> x).summaryStatistics().getMax());

    System.out.println("Filter odd numbers - " + input.stream().filter(x -> (x % 2 == 0))
        .collect(Collectors.toList()));

    System.out.println(
        "Sorted input list - " + input.stream().sorted().collect(Collectors.toList()));

    System.out.println("Original list - " + input);

    System.out.println("Filtering even numbers - ");
    input.stream().forEach(x -> {
      if (x % 2 != 0) {
        System.out.print(x + " ");

      }
    });
    System.out.println();
    Map<String, Integer> inputMap = new HashMap<>();
    inputMap.put("Sadiq", 33);
    inputMap.put("Sarine", 33);
    inputMap.put("Danish", 2);
    inputMap.put("Amara", 1);

    System.out.println("Map keys - " + inputMap.entrySet().stream().collect(Collectors.toList()));

    String s = "1,2,3,4,5";
    String s1[] = s.split(",");
    int input1[] = new int[s1.length];
    for (int i = 0; i < s1.length; i++) {
      input1[i] = Integer.parseInt(s1[i]);
    }
    IntStream.of(input1).boxed().forEach(System.out::println);
  }
}
