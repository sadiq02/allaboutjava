package com.allaboutjava.basicconcepts.problemsolving;

import java.util.Scanner;

public class RotateArray {


  public static void main(String[] args) {
    int a[] = new int[]{1, 2, 3, 4, 5};
    System.out.println("Enter number of rotations required");
    Scanner scanner = new Scanner(System.in);
    int rotation = scanner.nextInt();
    System.out.println("Given input");
    for (int i : a) {
      System.out.println(i);
    }
    a = rotateLeft(a, rotation);
    System.out.println("After left rotation");
    for (int i : a) {
      System.out.println(i);
    }
    int b[] = new int[]{1, 2, 3, 4, 5};
    b = rotateRight(b, rotation);
    System.out.println("After right rotation");
    for (int i : b) {
      System.out.println(i);
    }

  }

  private static int[] rotateRight(int[] b, int rotation) {
    int placeHolder[] = new int[rotation];
    int result[] = new int[b.length];
    for (int i = 0; i < rotation; i++) {
      placeHolder[i] = b[b.length - rotation + i];
    }
    System.out.println("Placeholder array");
    for (int i : placeHolder) {
      System.out.println(i);
    }
    // fill the resulting array with place holder elements first
    for (int i = 0; i < placeHolder.length; i++) {
      result[i] = placeHolder[i];
    }

    //append the resulting array with remaining input array elements
    for (int i = 0; i < b.length - rotation; i++) {
      result[i + rotation] = b[i];
    }

    return result;
  }

  private static int[] rotateLeft(int[] a, int rotation) {
    int placeHolder[] = new int[rotation];
    int result[] = new int[a.length];
    for (int i = 0; i < rotation; i++) {
      placeHolder[i] = a[i];
    }
    System.out.println("Placeholder array");
    for (int i : placeHolder) {
      System.out.println(i);
    }
    //fill the result array with input elements first
    for (int i = 0; i < a.length - rotation; i++) {
      result[i] = a[i + rotation];
    }
    // appent the result array with place holder elements
    for (int i = 0; i < rotation; i++) {
      result[i + (a.length - rotation)] = placeHolder[i];
    }
    return result;
  }

}
