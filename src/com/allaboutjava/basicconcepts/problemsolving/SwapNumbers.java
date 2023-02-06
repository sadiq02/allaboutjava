package com.allaboutjava.basicconcepts.problemsolving;

public class SwapNumbers {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println("Input : x = " + x + " y = " + y);
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("Output : x = " + x + " y = " + y);

  }
}
