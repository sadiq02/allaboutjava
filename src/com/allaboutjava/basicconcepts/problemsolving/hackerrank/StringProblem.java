package com.allaboutjava.basicconcepts.problemsolving.hackerrank;

import java.util.Scanner;

public class StringProblem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    /* Enter your code here. Print output to STDOUT. */
    System.out.println(A.length() + B.length());
    if (A.compareTo(B) > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    String resultA = A.substring(0, 1).toUpperCase().concat(A.substring(1, A.length()));
    String resultB = B.substring(0, 1).toUpperCase().concat(B.substring(1, B.length()));
    System.out.println(resultA + " " + resultB);
  }
}



