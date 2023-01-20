package com.allaboutjava.basicconcepts.recurrsion;

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
    for (int i = 0; i < 5; i++) {
      System.out.println("Fibonacci number for given value is " + fibonacciSeries.fibNumber(i));
    }
  }
}
