package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;

public class FindSubArrayWithGivenSum {

  public static void main(String[] args) {
    int input[] = {2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println("Enter sum value");
    Scanner scanner = new Scanner(System.in);
    int sum = scanner.nextInt();
    boolean found = false;
    //greedy way
    for (int i = 0; i < input.length; i++) {
      int tempSum = 0;
      tempSum += input[i];
      for (int j = i + 1; j < input.length; j++) {
        tempSum += input[j];
        if (tempSum > sum) {
          //ignore
          break;
        } else {
          if (tempSum == sum) {
            System.out.println("Required subarray is from index " + i + " to " + j);
            found = true;
            break;
          }
        }
      }
    }
    if (!found) {
      System.out.println("There is no subarray that summates to given sum");
    }
  }

}
