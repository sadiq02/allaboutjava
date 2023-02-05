package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArrays {

  public static void main(String[] args) {
    int[] input1 = new int[]{1, 2, 4, 6, 33, 88, 11};
    int[] input2 = new int[]{1, 5, 8, 9, 33};

    // int result[] = new int[input1.length + input2.length];
    Map<Integer, Integer> result = new TreeMap<>();
    for (int i = 0; i < input1.length; i++) {
      if (result.containsKey(input1[i])) {
        result.put(input1[i], result.get(input1[i]) + 1);
      } else {
        result.put(input1[i], 1);
      }
    }
    for (int i = 0; i < input2.length; i++) {
      if (result.containsKey(input2[i])) {
        result.put(input2[i], result.get(input2[i]) + 1);
      } else {
        result.put(input2[i], 1);
      }
    }

    for (Map.Entry<Integer, Integer> temp : result.entrySet()) {
      for (int i = 0; i < temp.getValue(); i++) {
        System.out.println(temp.getKey());
      }
    }
  }

}
