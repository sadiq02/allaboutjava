package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashSet;
import java.util.Set;

public class RearrangeArray {

  public static void main(String[] args) {
    int[] input = new int[]{10, 1, 3, 5, 7, 0, 2, 4, 6, 8,14,18};
    Set<Integer> integerSet = new HashSet<>();
    for (int i : input) {
      integerSet.add(i);
    }
    int[] result = new int[20];
    for (int i = 0; i < input.length; i++) {
      if (integerSet.contains(input[i])) {
        result[input[i]] = input[i];
      } else {
        result[i] = 0;
      }
    }
    for (int temp : result) {
      System.out.println(temp);
    }
  }

}
