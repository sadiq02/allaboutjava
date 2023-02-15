package com.allaboutjava.practice;

public class ArrayRotation {

  static void rotateLeft(int a[], int rotationCount) {
    System.out.println("Left rotation");
    int temp[] = new int[rotationCount];
    for (int i = 0; i < rotationCount; i++) {
      temp[i] = a[i];
    }

    for (int i = 0; i < a.length - rotationCount; i++) {
      a[i] = a[i + rotationCount];
    }

    for (int i = 0; i < rotationCount; i++) {
      a[i + rotationCount + 1] = temp[i];
    }
    for (int x : a) {
      System.out.println(x);
    }
  }

  static void rotateRight(int a[], int rotationCount) {
    System.out.println("\nRight rotation");
    int temp[] = new int[rotationCount];
    for (int i = 0; i < rotationCount; i++) {
      temp[i] = a[a.length - rotationCount + i];
    }
    int temp1[] = new int[a.length - rotationCount];
    for (int i = 0; i < a.length - rotationCount; i++) {
      temp1[i] = a[i];
    }
    for (int i = 0; i < rotationCount; i++) {
      a[i] = temp[i];
    }
    for (int i = 0; i < temp1.length; i++) {
      a[i + rotationCount] = temp1[i];
    }
    for (int x : a) {
      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5};
    rotateLeft(input, 2);
    int[] input1 = {1, 2, 3, 4, 5};
    rotateRight(input1, 2);
  }

}
