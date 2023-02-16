package com.allaboutjava.practice;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberInArray {

  public static void main(String[] args) {
    List<Integer> input = new ArrayList<>();
    input.add(10);
    input.add(20);
    input.add(30);
    input.add(40);
    System.out.println(input.stream().mapToInt(x->x).summaryStatistics().getMax());
    System.out.println(input.stream().mapToInt(x->x).max());
  }
}
