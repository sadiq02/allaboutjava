package com.allaboutjava.basicconcepts.abstraction;

public class AbstractMainClass extends AbstractClass {

  public static void main(String[] args) {
    // AbstractClass abstractClass = new AbstractClass(); // cannot use the constructor. This will give compile time error.
    AbstractMainClass abstractMainClass = new AbstractMainClass();
    abstractMainClass.show();
    System.out.println(
        abstractMainClass.x); //This will return 10 because we have used constructor to initialize this value.
  }

  @Override
  void show() {
    System.out.println("Inside AbstractMainClass.show()");
  }
}
