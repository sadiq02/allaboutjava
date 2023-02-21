package com.allaboutjava.basicconcepts.problemsolving.hackerrank;

/**
 * You are choreographing a circus show with various animals. For one act, you are given two
 * kangaroos on a number line ready to jump in the positive direction (i.e, toward positive
 * infinity).
 * <p>
 * The first kangaroo starts at location  and moves at a rate of  meters per jump. The second
 * kangaroo starts at location  and moves at a rate of  meters per jump. You have to figure out a
 * way to get both kangaroos at the same location at the same time as part of the show. If it is
 * possible, return YES, otherwise return NO.
 */
public class KangarooProblem {

  public static void main(String[] args) {
    System.out.println(kangaroo(2564, 5393, 5121, 2836));
  }

  public static String kangaroo(int x1, int v1, int x2, int v2) {
    int i = 0;
    while (i <= 10000) {
      if ((x1 + v1) + (v1 * i) == (x2 + v2) + (v2 * i)) {
        return "YES";
      }
      i++;
    }

    return "NO";
  }
}
