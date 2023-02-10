package com.allaboutjava.basicconcepts.designpatterns.factory;

public class SquareShape implements Shape {

  public SquareShape() {
  }

  @Override
  public void draw() {
    System.out.println("Square");
  }
}
