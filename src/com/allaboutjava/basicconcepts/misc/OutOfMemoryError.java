package com.allaboutjava.basicconcepts.misc;

import java.util.Vector;

public class OutOfMemoryError {

  public static void main(String[] args) {
    Vector v = new Vector(Integer.MAX_VALUE);
  }
}
