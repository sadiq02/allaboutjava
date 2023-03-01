package com.allaboutjava.basicconcepts.problemsolving;

public class LargestSumContagiousSubArray {

  public static void main(String[] args) {
    int input[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int input1[] = {9, 10, 2, 4, -10, -5, -3};

    System.out.println("Largest Sum in given array input - " + findLargestSum(input));
    System.out.println("Largest Sum in given array input1 - " + findLargestSum(input1));
  }

  private static int findLargestSum(int[] input) {
    int finalSum = 0;
    int tempSum = 0;
    for (int i = 0; i < input.length; i++) {
      tempSum = tempSum + input[i] > 0 ? tempSum + input[i] : 0;
      finalSum = Math.max(finalSum, tempSum);
    }
    return finalSum;
  }
}
