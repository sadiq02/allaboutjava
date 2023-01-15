package com.allaboutjava.basicconcepts.recurrsion;

public class FindSumUsingRecurrsion {

  private int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(n - 1);
  }

  public static void main(String[] args) {
    FindSumUsingRecurrsion findMissingNaturalNumber = new FindSumUsingRecurrsion();
    System.out.println("Sum - "+findMissingNaturalNumber.sum(5));
  }
}
