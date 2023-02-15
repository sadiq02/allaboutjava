package com.allaboutjava.basicconcepts.misc;

public class DefaulAndStatictMethodClass implements Interface1 {

  @Override
  public void display() {
    System.out.println("Inside DefaultMethodClass.display()");
  }

  @Override
  public void defaultDisplay() {
    //Interface1.super.defaultDisplay();
    System.out.println("Inside DefaultMethodClass.defaultDisplay");
  }

  public static void main(String[] args) {
    DefaulAndStatictMethodClass defaultMethodClass = new DefaulAndStatictMethodClass();
    defaultMethodClass.defaultDisplay(); //can be overridden
    Interface1.staticDisplay(); //cannot be since its static method in the interface1
  }
}
