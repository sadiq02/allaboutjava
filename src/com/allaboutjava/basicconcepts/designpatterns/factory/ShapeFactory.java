package com.allaboutjava.basicconcepts.designpatterns.factory;

public class ShapeFactory implements Shape {

  @Override
  public Shape getShape(String shapeString) {
    if (shapeString.equalsIgnoreCase("square")) {
      return new SquareShape(shapeString);
    }
    if (shapeString.equals("rectangle")) {
      return new RectangleShape(shapeString);
    }
    return null;
  }
}
