package com.allaboutjava.basicconcepts.datastructure.arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotationUsingCollection {

  public static void main(String[] args) {
    int input[] = new int[]{1, 2, 3, 4, 5};
    int input1[] = new int[]{1, 2, 3, 4, 5};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of rotations");
    int rotationCount = scanner.nextInt();
    List<Integer> inputList = IntStream.of(input).boxed().collect(Collectors.toList());
    Collections.rotate(inputList, -rotationCount);
    System.out.println("Left side rotation");
    inputList.stream().forEach(System.out::println);
    List<Integer> inputList1 = IntStream.of(input1).boxed().collect(Collectors.toList());
    Collections.rotate(inputList1, rotationCount);
    System.out.println("Right side rotation");
    inputList1.stream().forEach(System.out::println);
  }

}
