package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class StringProblem {

  public static void main(String[] args) {
    String input = "aaahhcccddaah";
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }
    for (Map.Entry<Character, Integer> temp : map.entrySet()) {
      System.out.print(temp.getKey() + "" + temp.getValue());
    }
  }
}
