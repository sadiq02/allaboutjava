package com.allaboutjava.basicconcepts.recurrsion;

import java.util.Scanner;

public class FibonacciSeries {

  public int fibNumber(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibNumber(n - 1) + fibNumber(n - 2);
  }

  public static void main(String[] args) {
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    System.out.println("Enter a number");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.println("Fibonacci value for given input is " + fibonacciSeries.fibNumber(input));
  }
}
