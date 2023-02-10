package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

public class NonRoundedShapeFactory extends AbstractShapeFactory {

  @Override
  Shape getShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("square")) {
      return new NonRoundedSquareShape();
    }
    return null;
  }
}
