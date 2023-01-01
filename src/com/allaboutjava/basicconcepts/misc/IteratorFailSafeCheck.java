package com.allaboutjava.basicconcepts.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorFailSafeCheck {

  public static void main(String[] args) {
    List<String> input = new ArrayList<>();

    input.add("value1");
    input.add("value2");
    input.add("value3");
    input.add("value4");
    input.add("value5");
    input.add("value6");

    Iterator<String> iterator = input.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      i++;
      String currentValue = iterator.next();
      if (i % 2 == 0) {
        iterator.remove();
        System.out.println("Removed - " + currentValue);
      }
    }

    System.out.println("\nPost removal operation");
    Iterator<String> iterator1 = input.iterator();
    while (iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }
  }
}
