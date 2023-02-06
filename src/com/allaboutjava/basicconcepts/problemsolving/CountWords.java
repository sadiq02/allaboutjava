package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] inputStrings = input.split("[ ?,.!]");
    System.out.println("Number of words in given string - " + inputStrings.length);

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < inputStrings.length; i++) {
      if (map.containsKey(inputStrings[i])) {
        map.put(inputStrings[i], map.get(inputStrings[i]) + 1);
      } else {
        map.put(inputStrings[i], 1);
      }
    }
    for (Map.Entry<String, Integer> temp : map.entrySet()) {
      System.out.println(
          temp.getKey() + " occurs " + temp.getValue() + " times in given input string");
    }
  }
}
