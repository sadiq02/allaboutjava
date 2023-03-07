package com.allaboutjava.basicconcepts.misc;

import java.util.Arrays;
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

    System.out.println(
        inputMap.keySet().stream().filter(x -> !x.isBlank()).anyMatch(x -> x.length() == 7));

    System.out.println("reduce method demo on string");
    System.out.println(inputMap.keySet().stream().reduce("", (x, y) -> {
      if (x.isEmpty()) { //to avoid trailing _ before first value
        return y;
      }
      return x + "_" + y;
    }));

    System.out.println("Summation of numbers using reduce function");
    System.out.println("input numbers sum result - " + input.stream().reduce(0, Integer::sum));
    System.out.println(input.stream().mapToInt(x->x).sum());

    System.out.println("filtering even numbers and odd numbers that are not divisible by 7");
    input.stream().filter(x -> {
          if (x % 2 != 0) {
            if (x % 7 == 0) {
              return true;
            }
          }
          return false;
        }
    ).forEach(System.out::println);

    inputMap.entrySet().stream().map(x -> x.getKey().length()).forEach(System.out::println);

    System.out.println("flatMap demo code");
    List<Integer> numberList1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numberList2 = Arrays.asList(6, 7, 8, 9, 10);
    List<Integer> numberList3 = Arrays.asList(11, 12, 13, 14, 15);

    List<List<Integer>> bigList = Arrays.asList(numberList1, numberList2, numberList3);
    System.out.println("if map() was used");
    List<List<Integer>> mapList = bigList.stream().map(x -> x).collect(Collectors.toList());
    System.out.println(mapList);
    System.out.println("When flatMap is used");
    List<Integer> flatMapList = bigList.stream().flatMap(x -> x.stream())
        .collect(Collectors.toList());
    System.out.println(flatMapList);
  }
}
