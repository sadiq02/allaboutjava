package com.allaboutjava.basicconcepts.abstraction;

public abstract class AbstractClass {

  int x = 20;

  AbstractClass() {
    x = 10;
  }

  abstract void show();

  void display() {
    System.out.println("Inside display()");
  }
}
