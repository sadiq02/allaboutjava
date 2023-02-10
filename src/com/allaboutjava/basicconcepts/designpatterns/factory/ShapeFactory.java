package com.allaboutjava.basicconcepts.designpatterns.factory;

public class ShapeFactory {

  public static Shape getShape(String shape) {
    if (shape.equalsIgnoreCase("rectangle")) {
      return new RectangleShape();
    }
    if(shape.equalsIgnoreCase("square")){
      return new SquareShape();
    }
    return null;
  }

}
