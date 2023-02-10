package com.allaboutjava.basicconcepts.designpatterns.factory;

public class RectangleShape implements Shape {

  public RectangleShape() {
  }

  @Override
  public void draw() {
    System.out.println("Rectangle");
  }
}
