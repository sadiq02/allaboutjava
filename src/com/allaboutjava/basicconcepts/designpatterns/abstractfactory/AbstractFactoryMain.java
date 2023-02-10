package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

import java.util.Optional;

public class AbstractFactoryMain {

  public static void main(String[] args) {
    AbstractShapeFactory shapeFactory1 = FactoryProducer.getCorrectShapeFactory(true);
    Shape shape = shapeFactory1.getShape("circle");
    shape.draw();


    AbstractShapeFactory shapeFactory2 = FactoryProducer.getCorrectShapeFactory(false);
    Shape shape2 = shapeFactory2.getShape("square");
    shape2.draw();
  }
}
