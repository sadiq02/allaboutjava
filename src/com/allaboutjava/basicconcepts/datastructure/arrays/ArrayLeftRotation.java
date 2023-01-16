package com.allaboutjava.basicconcepts.datastructure.arrays;

import java.util.Scanner;

public class ArrayLeftRotation {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array size");
    int size = scan.nextInt();
    int input[] = new int[size];
    int result[] = new int[size];
    System.out.println("Enter array elements");
    for (int i = 0; i < size; i++) {
      input[i] = scan.nextInt();
    }
    System.out.println("Before rotations");
    for (int k : input) {
      System.out.println(k);
    }
    System.out.println("How many rotation to be done?");
    int rotationCount = scan.nextInt();
    int temp[] = new int[rotationCount];

    for (int i = 0; i < rotationCount; i++) {
      temp[i] = input[i];
    }

    for (int i = 0; i < size - rotationCount; i++) {
      result[i] = input[i + rotationCount];
    }

    for (int i = 0; i < rotationCount; i++) {
      result[i + (size - rotationCount)] = temp[i];
    }

    System.out.println("After rotations");
    for (int k : result) {
      System.out.println(k);
    }

  }
}
