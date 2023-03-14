package com.allaboutjava.practice;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSequenceOfConsecutiveNumbers {

  public static void main(String[] args) {
    int input[] = new int[]{23, 4, 6, 89, 56, 21, 22, 24, 5, 8, 9, 7, 88, 54, 55, 10};
    Set<Integer> inputSet = IntStream.of(input).boxed().collect(Collectors.toSet());
    int longestStreak = 0;
    for (int temp : inputSet) {
      if (!inputSet.contains(temp - 1)) {
        int currentNumber = temp;
        int currentStreak = 1;
        while (inputSet.contains(currentNumber + 1)) {
          currentStreak += 1;
          currentNumber += 1;
        }
        longestStreak = Math.max(longestStreak, currentStreak);
      }
    }
    System.out.println(longestStreak);
  }
}
