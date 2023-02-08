package com.allaboutjava.basicconcepts.problemsolving.practice;

public class LargestSubstring {

  public static void main(String[] args) {
    String input = "aszxcvbnmdasdasdjklpou";
    int result = 0;
    for (int i = 0; i < input.length(); i++) {
      boolean visited[] = new boolean[300];
      for (int j = i; j < input.length(); j++) {
        if (visited[input.charAt(j)]) {
          break;
        } else {
          result = Math.max(result, j - i + 1);
          visited[input.charAt(j)] = true;
        }
      }
      visited[input.charAt(i)] = true;
    }
    System.out.println(result);
  }

}
