package com.allaboutjava.basicconcepts.problemsolving.hackerrank;

import java.util.Scanner;

public class StringSplit {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    String[] strings = s.split("[ ?,'.!@]+");
    System.out.println(strings.length);
    for (String temp : strings) {
      System.out.print(temp.trim()+"\n");
    }
    scan.close();

  }
}
