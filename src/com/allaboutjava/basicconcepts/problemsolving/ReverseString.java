package com.allaboutjava.basicconcepts.problemsolving;

public class ReverseString {

  public static void main(String[] args) {
    String str = "hello";
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
  }
}
