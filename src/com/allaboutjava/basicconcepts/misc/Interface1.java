package com.allaboutjava.basicconcepts.misc;

@FunctionalInterface
public interface Interface1 {

  public void display();

  public default void display1() {
    System.out.println("Inside display1()");
  }
}


