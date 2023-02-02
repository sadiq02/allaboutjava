package com.allaboutjava.basicconcepts.String;

import java.util.Scanner;

public class CheckSubstring {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the input string");
    String input = scan.nextLine();
    System.out.println("Enter the substring to be searched");
    Scanner scan1 = new Scanner(System.in);
    String subString = scan1.next();
    int subStringSize = subString.length();
    boolean isPresent = false;
    for (int i = 0; i < input.length() - subStringSize; i++) {
      if (input.substring(i, i + subStringSize).equalsIgnoreCase(subString)) {
        isPresent = true;
        break;
      }
    }
    if (isPresent) {
      System.out.println("Yes the input contains the given substring");
    } else {
      System.out.println("No! Given substring is not present in the input");
    }

  }

}
