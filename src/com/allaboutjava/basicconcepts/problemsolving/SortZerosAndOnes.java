package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class SortZerosAndOnes {

  public static void main(String[] args) {
    int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1,
        1,
        1, 1};
    System.out.println("Input");
    for (int i : input) {
      System.out.print(i + " ");
    }
    sortArray(input);
  }

  private static void sortArray(int[] input) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length; i++) {
      if (map.containsKey(input[i])) {
        map.put(input[i], map.get(input[i]) + 1);
      } else {
        map.put(input[i], 1);
      }
    }
    System.out.println("\nAfter sorting");
    for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
      int temp1 = temp.getKey();
      int temp2 = temp.getValue();
      for (int i = 0; i < temp2; i++) {
        System.out.print(temp1 + " ");
      }
    }
  }

}
