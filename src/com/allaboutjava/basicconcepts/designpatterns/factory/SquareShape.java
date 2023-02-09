package com.allaboutjava.basicconcepts.designpatterns.factory;

public class SquareShape implements Shape {

  public SquareShape(String shapeString) {
    System.out.println(shapeString);
  }

  @Override
  public Shape getShape(String shapeString) {
    return new SquareShape("square");
  }
}
