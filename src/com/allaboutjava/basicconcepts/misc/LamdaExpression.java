package com.allaboutjava.basicconcepts.misc;

@FunctionalInterface
interface Math {

  int calculate(int a, int b);
}

public class LamdaExpression {

  public static void main(String[] args) {
    int a1 = 10;
    int b1 = 20;
    Math sum = (a, b) -> {
      return a + b;
    };
    Math diff = (a, b) -> {
      return java.lang.Math.floorMod(a, b);
    };
    sum.calculate(10, 20);
    System.out.println("Sum - " + sum.calculate(10, 20));
    diff.calculate(10, 20);
    System.out.println("Diff - " + diff.calculate(10, 20));

  }


}
