package com.allaboutjava.basicconcepts.misc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReversingMap {

  public static void main(String[] args) {
    Map<String, String> input = new HashMap<>();
    input.put("Sadiq", "Father");
    input.put("Sarine", "Mother");
    input.put("Danish", "Son");
    input.put("Amara", "Daughter");

    System.out.println("Input : ");
    input.values().stream().forEach(System.out::println);
    reverseMap(input);
  }

  private static void reverseMap(Map<String, String> input) {
    List<String> keys = input.keySet().stream().collect(Collectors.toList());
    Collections.reverse(keys);
    Iterator<String> itr = keys.listIterator();
    System.out.println("\nAfter reversing");
    while (itr.hasNext()) {
      System.out.println(input.get(itr.next()));
    }

  }

}
