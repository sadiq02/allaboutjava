package com.allaboutjava.basicconcepts.misc;

/**
 * Program to demonstrate that the foreach loop can be used with any primitive data type
 */
public class ForEachLoopOperation {

  public static void main(String[] args) {
    int[] input = {1,2,3,4,5,6,7};
    for (int s : input) {
      System.out.println(s);
    }
  }

}
