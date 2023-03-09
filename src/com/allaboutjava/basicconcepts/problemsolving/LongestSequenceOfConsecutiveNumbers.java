package com.allaboutjava.basicconcepts.problemsolving;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSequenceOfConsecutiveNumbers {

  public static void main(String[] args) {
    int[] input = {35, 8, 33, 21, 23, 3, 9, 4, 34, 24, 32, 10, 22, 36, 37, 38};
    HashSet<Integer> inputSet = (HashSet<Integer>) IntStream.of(input).boxed()
        .collect(Collectors.toSet());
    //inputSet.forEach(System.out::println);

    int longestStreak = 0;
    for (int temp : inputSet) {
      if (!inputSet.contains(temp - 1)) {
        int currentNumber = temp;
        int currentStreak = 1;

        while (inputSet.contains(currentNumber + 1)) {
          currentNumber += 1;
          currentStreak += 1;
        }
        longestStreak = Math.max(longestStreak, currentStreak);
      }
    }
    System.out.println("Length of longest sequence of numbers in given array is "
        + longestStreak); //correct answer is 7
  }

}
