package com.allaboutjava.basicconcepts.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsUtilMain {

  public static void main(String[] args) {
    List<Integer> input = Arrays.stream(new int[]{1, 2, 3, 4, 5}).boxed()
        .collect(Collectors.toList());
    List<Integer> unmodifiableList = Collections.unmodifiableList(input);
    input.forEach(System.out::println); //no issue modifying original list

    unmodifiableList.add(44); // throws UnsupportedOperationException
    unmodifiableList.forEach(System.out::println);

    Set<String> stringSet = new HashSet<>();
    stringSet.add("Sadiq");
    stringSet.add("Sarine");
    stringSet.forEach(System.out::println);

    Set<String> unmodifiableSet = Collections.unmodifiableSet(stringSet);
    unmodifiableSet.add("Danish"); // throws UnsupportedOperationException
  }
}
