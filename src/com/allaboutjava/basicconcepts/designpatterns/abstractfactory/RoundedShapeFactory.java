package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

public class RoundedShapeFactory extends AbstractShapeFactory {

  @Override
  Shape getShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("circle")) {
      return new RoundedCircleShape();
    }
    return null;
  }
}
