package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertMapToList {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Sadiq", "Karnataka");
    map.put("Sarine", "Kerala");

    List<String> output = map.entrySet().stream().map(x -> x.getValue())
        .collect(Collectors.toList());
    output.stream().forEach(System.out::println);

    int[] a = {1, 2, 3, 4, 5};
    IntStream.of(a).boxed().forEach(System.out::println);

    String s = "1,2,3,4,5";
    String[] strings = s.split(",");
    int[] input = new int[s.split(",").length];
    for (int i = 0; i < strings.length; i++) {
      input[i] = Integer.parseInt(strings[i]);
    }
    System.out.println("String converted to output using streams");
    IntStream.of(input).boxed().forEach(System.out::println);
  }

}
