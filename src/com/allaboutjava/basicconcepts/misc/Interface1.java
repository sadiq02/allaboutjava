package com.allaboutjava.basicconcepts.misc;

@FunctionalInterface
public interface Interface1 {

  public void display();

  public default void defaultDisplay() {
    System.out.println("Inside defaultDisplay()");
  }

  public static void staticDisplay() {
    System.out.println("Inside staticDisplay()");
  }
}


