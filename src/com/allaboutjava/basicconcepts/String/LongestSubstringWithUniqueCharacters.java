package com.allaboutjava.basicconcepts.String;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithUniqueCharacters {

  public static void main(String[] args) {
    String input = "asdasdasdjklpou";
    boolean visited[] = new boolean[200];
    int resultLength = 0;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      if (visited[input.charAt(i)]) {
        // add the previous substring length to result array list to comapre at the end.
        result.add(resultLength);
        //result the length to zero to restart it from next unique character.
        resultLength = 0;
      } else {
        visited[input.charAt(i)] = true;
        resultLength++;
      }

    }
    if (resultLength > 0) {
      result.add(resultLength);
    }
    System.out.println(
        "Substring length with maximum unique characters in given input is " + result.stream()
            .mapToInt(x -> x).summaryStatistics().getMax());
  }

}
