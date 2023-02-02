package com.allaboutjava.basicconcepts.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountDuplicateString {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the input string");
    String input = scan.nextLine();
    String[] inputArray = input.split("[ ,.]");
    Map<String, Integer> inputMap = new HashMap<>();
    for (int i = 0; i < inputArray.length; i++) {
      if (inputMap.containsKey(inputArray[i])) {
        inputMap.put(inputArray[i], inputMap.get(inputArray[i]) + 1);
      } else {
        inputMap.put(inputArray[i], 1);
      }
    }
    Iterator<Entry<String, Integer>> itr = inputMap.entrySet().iterator();
    while (itr.hasNext()) {
      Map.Entry<String, Integer> temp = itr.next();
      if (temp.getValue() > 1) {
        System.out.println(temp.getKey() + " is duplicated " + temp.getValue() + " times");
      }
    }
  }
}
