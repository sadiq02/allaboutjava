package com.allaboutjava.basicconcepts.misc;

public class StackOverFlowError {

  static int fibSeries(int i) {
    if (i == 0) {
      return 0;
    }
    if (i == 1 || i == 2) {
      return i;
    }
    return i + fibSeries(i - 1);
  }


  static int fibSeriesCausingStackOverflow(
      int i) { // causes stack over flow since there is no terminating condition
    return fibSeriesCausingStackOverflow(i) + fibSeriesCausingStackOverflow(i - 1);
  }

  public static void main(String[] args) {
    System.out.println(fibSeries(4));
    //fibSeriesCausingStackOverflow(7);
  }
}
