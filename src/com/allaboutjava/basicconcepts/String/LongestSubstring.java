package com.allaboutjava.basicconcepts.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the input string");
    String input = scan.nextLine();
    Map<String, Integer> map = new HashMap<>();
    int max = 0;
    boolean visited[] = new boolean[300];
    String tempString = "";
    for (int i = 0; i < input.length(); i++) {
      if (visited[input.charAt(i)]) {
        if (tempString.length() > 0) {
          map.put(tempString.toString(), tempString.length());
          tempString = "";
        }
        visited[input.charAt(i)] = false;

      } else {
        visited[input.charAt(i)] = true;
        tempString = tempString + input.charAt(i);
      }
    }
    if (tempString.length() > 0) {
      map.put(tempString.toString(), tempString.length());
    }
    System.out.println("Length of a longest substring with unique characters - " +
        map.entrySet().stream().mapToInt(x -> x.getValue()).summaryStatistics().getMax());
    System.out.println("Printing all substrings along with lengths");
    for (Map.Entry<String, Integer> temp1 : map.entrySet()) {
      System.out.println(temp1.getKey() + " - " + temp1.getValue());
    }
  }

}
