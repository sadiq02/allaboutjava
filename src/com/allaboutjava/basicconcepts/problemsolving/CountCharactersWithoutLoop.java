package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersWithoutLoop {

  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    String input = "this is alksjdjkvaksejuwqerylaksjfakjsdfkasdhfkljshdfkjsahdf";
    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }
    for (Map.Entry<Character, Integer> temp : map.entrySet()) {
      System.out.println(temp.getKey() + " - " + temp.getValue());
    }

    String str ="sadiq";
    System.out.println(str.getClass());

    String str1 = "sadiqhussain";
    System.out.println(str1.getClass());

  }
}
