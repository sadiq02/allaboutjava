package com.allaboutjava.basicconcepts.problemsolving;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSubArrayWithGivenSum {

  static void findSubArrayUsingDifferentLogic(int[] input, int sum) {
    List<Integer> inputList = IntStream.of(input).boxed().collect(Collectors.toList()).stream()
        .filter(x -> x <= sum).collect(
            Collectors.toList());
    boolean found = false;
    for (int i = 0; i < inputList.size(); i++) {
      int temp = 0;
      temp += inputList.get(i);
      for (int j = i + 1; j < inputList.size(); j++) {
        temp += inputList.get(j);
        if (temp == sum) {
          System.out.println("Sub array found between index " + i + " and " + j);
          found = true;
        }
      }
    }
    if (!found) {
      System.out.println("No subarray found for given sum!");
    }
  }

  public static void main(String[] args) {
    int input[] = {2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println("Enter sum value");
    Scanner scanner = new Scanner(System.in);
    int sum = scanner.nextInt();
   // findSubArrayUsingDifferentLogic(input, sum);
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
          }
        }
      }
    }

    if (!found) {
      System.out.println("There is no subarray that summates to given sum");
    }
  }

}
