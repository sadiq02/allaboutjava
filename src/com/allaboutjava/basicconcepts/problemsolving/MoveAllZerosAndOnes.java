package com.allaboutjava.basicconcepts.problemsolving;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveAllZerosAndOnes {

  public static void main(String[] args) {
    int[] input = new int[]{0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
    int inputLength = input.length;
    List<Integer> listOfOnes = IntStream.of(input).boxed().collect(Collectors.toList());
    listOfOnes = listOfOnes.stream().filter(x -> x > 0).collect(Collectors.toList());
    for (int i = 0; i < inputLength - listOfOnes.size(); i++) {
      System.out.print(0 + " ");
    }
    for (int j = 0; j < listOfOnes.size(); j++) {
      System.out.print(1 + " ");
    }
  }
}
