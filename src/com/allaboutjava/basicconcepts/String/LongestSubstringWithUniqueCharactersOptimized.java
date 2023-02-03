package com.allaboutjava.basicconcepts.String;

public class LongestSubstringWithUniqueCharactersOptimized {

  public static void main(String[] args) {
    String input = "aszxcvbnmdasdasdjklpou";
    boolean visited[] = new boolean[200];
    int resultLength = 0;
    int max = 0;
    for (int i = 0; i < input.length(); i++) {
      if (visited[input.charAt(i)]) {
        // add the previous substring length to result array list to comapre at the end.
        if (resultLength > max) {
          max = resultLength;
        }
        //result the length to zero to restart it from next unique character.
        resultLength = 0;
      } else {
        visited[input.charAt(i)] = true;
        resultLength++;
      }

    }
    // if the last comparision was the longest one, the flow will not go to 'if' condition which
    // means the 'resultLength' will not be added to the 'result' array list. Hence we add it
    // explicitly after loop processing is over after checking that its > 0
    if (resultLength > 0) {
      if (resultLength > max) {
        max = resultLength;
      }
    }
    System.out.println(
        "Substring length with maximum unique characters in given input is " + max);
  }

}
