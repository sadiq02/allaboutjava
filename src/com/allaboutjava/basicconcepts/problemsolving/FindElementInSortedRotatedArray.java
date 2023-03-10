package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;

public class FindElementInSortedRotatedArray {

  public static void main(String[] args) {
    int[] input = {4, 5, 6, 7, 1, 2, 3};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter key to be searched");
    int key = scanner.nextInt();
    if (searchKey(input, 0, input.length, key) == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("Found");
    }
    System.out.println("Searching element using recursive approach");
    if (searchKeyRecursively(input, 0, input.length - 1, key) == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("Found");
    }
  }

  private static int searchKeyRecursively(int[] input, int start, int length, int key) {
    if (start > length) {
      return -1;
    }
    int midIndex = start + length / 2;
    if (input[midIndex] == key) {
      return midIndex;
    }
    if (input[start] <= input[midIndex]) { // to check if this part of array is sorted
      if (key >= input[start] && key <= input[midIndex]) {
        return searchKey(input, start, midIndex, key);
      }
    }
    //this piece of code is for the scenario when the subarray is not sorted, so directly checking the range in which the key falls and calling the search function recursively.
    if (key >= input[midIndex] && key <= input[length]) {
      return searchKey(input, midIndex, length, key);
    }
    return -1;
  }

  //without recurrsion
  private static int searchKey(int[] input, int i, int length, int key) {
    if (i > length) {
      return -1;
    }
    int midElement = input[input.length / 2];
    if (midElement == key) {
      return input.length / 2;
    }

    if (key < midElement) {
      for (int j = 0; j < input.length / 2; j++) {
        if (input[j] == key) {
          return j;
        }
      }
    } else {

      for (int j = 0; j < input.length / 2; j++) {
        if (input[j] == key) {
          return j;
        }
      }
    }
    return -1;
  }
}
