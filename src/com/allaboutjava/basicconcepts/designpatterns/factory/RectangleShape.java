package com.allaboutjava.basicconcepts.designpatterns.factory;

public class RectangleShape implements Shape {

  public RectangleShape(String shapeString) {
    System.out.println(shapeString);
  }

  @Override
  public Shape getShape(String shapeString) {
    return new RectangleShape("rectangle");
  }
}
