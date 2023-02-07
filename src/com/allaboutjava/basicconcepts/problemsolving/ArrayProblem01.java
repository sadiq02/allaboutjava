package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.Map;

/**
 * Two sum of an array: In this question you will be given an array arr and a target. You have to
 * return the indices of the two numbers such that they add up to target.
 */
public class ArrayProblem01 {

  public static void main(String[] args) {
    int target = 20;
    int input[] = new int[]{14, 9, 4, 8, 6};
    int result[] = new int[2];
    result = findIndices1(input, target);
    System.out.println("Required indices");
    for (int i : result) {
      System.out.println(i);
    }
  }

  //using brute force
  private static int[] findIndices(int[] input, int target) {
    int[] indices = new int[]{-1, -1};
    for (int i = 0; i < input.length; i++) {
      for (int j = i + 1; j < input.length; j++) {
        int temp = input[i] + input[j];
        if (temp == target) {
          indices[0] = i;
          indices[1] = j;
          return indices;
        }
      }
    }
    return indices;
  }

  //using hashmap
  private static int[] findIndices1(int[] input, int target) {
    int[] indices = new int[]{-1, -1};
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length; i++) {
      int diff = target - input[i];
      if (map.containsKey(diff)) {
        indices = new int[]{map.get(diff), i};
        return indices;
      } else {
        map.put(input[i], i);
      }
    }
    return indices;
  }
}
