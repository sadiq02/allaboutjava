package com.allaboutjava.basicconcepts.misc;

public class StaticBlock {

  static class ChildStaticClass {

    static {
      System.out.println(
          "Inside ChildStaticClass.static "); // this will be printed only if this class is called from main method
    }

    static int x = 10;
  }

  static {
    System.out.println("Inside StaticBlock.static"); // this will be printed first
  }

  static {
    System.out.println("Inside StaticBlock.static 1"); // this will be printed second
  }

  public static void main(String[] args) {
    System.out.println("Hi from main method");
    System.out.println(
        ChildStaticClass.x); // only because of this call, the static block from 'ChildStaticClass' will get executed
  }
}
