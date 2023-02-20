package com.allaboutjava.basicconcepts.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsUtilMain {

  public static void main(String[] args) {
    List<Integer> input = Arrays.stream(new int[]{1, 2, 3, 4, 5}).boxed()
        .collect(Collectors.toList());
    List<Integer> unmodifiableList = Collections.unmodifiableList(input);
    input.forEach(System.out::println); //no issue modifying original list

    // unmodifiableList.add(44); // throws UnsupportedOperationException
    unmodifiableList.forEach(System.out::println);

    Set<String> stringSet = new HashSet<>();
    stringSet.add("Sadiq");
    stringSet.add("Sarine");
    stringSet.forEach(System.out::println);

    Set<String> unmodifiableSet = Collections.unmodifiableSet(stringSet);
    //unmodifiableSet.add("Danish"); // throws UnsupportedOperationException

    Map<String, Integer> map = new HashMap<>();
    map.put("Sadiq", 34);

    Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
    unmodifiableMap.entrySet().stream().forEach(System.out::println);
    // unmodifiableMap.put("Sarine", 33);// throws UnsupportedOperationException

    // disjoint() function demo
    List<String> list1 = new ArrayList<String>(List.of(new String[]{"Sadiq", "Sarine"}));
    List<String> list2 = new ArrayList<String>(List.of(new String[]{"Danish", "Amara"}));
    List<String> list3 = new ArrayList<String>(List.of(new String[]{"Sadiq", "Danish"}));
    System.out.println("Are given lists unique ? : " + Collections.disjoint(list1, list2));
    System.out.println("Are given lists unique ? : " + Collections.disjoint(list1, list3));

    //fill
    Collections.fill(input, 55);
    input.forEach(System.out::println);

    //frequency
    System.out.println(
        "Number of occurences for 55 in given list - " + Collections.frequency(input, 55));
  }
}
