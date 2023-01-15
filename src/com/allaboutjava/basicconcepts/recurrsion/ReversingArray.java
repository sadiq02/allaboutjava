package com.allaboutjava.basicconcepts.recurrsion;

public class ReversingArray {

  public void reverse(int i, int a[]) {
    if (i >= a.length / 2) {
      return;
    }
    int temp = a[i];
    a[i] = a[a.length - 1 - i];
    a[a.length - 1 - i] = temp;
    reverse(i + 1, a);
  }


  public static void main(String[] args) {
    int a[] = {1, 55, 33, 44, 88,77};
    System.out.println("Before reversing\n");
    for (int i : a) {
      System.out.println(i);
    }
    ReversingArray palindromeCheckForArray = new ReversingArray();
    palindromeCheckForArray.reverse(0, a);
    System.out.println("\nAfter reversing\n");
    for (int i : a) {
      System.out.println(i);
    }
  }
}
