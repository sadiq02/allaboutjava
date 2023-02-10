package com.allaboutjava.basicconcepts.designpatterns.factory;

public class FactoryPatternMain {

  public static void main(String[] args) {
    Shape shape1 = ShapeFactory.getShape("square");
    Shape shape2 = ShapeFactory.getShape("rectangle");

    shape1.draw();
    shape2.draw();
  }


}
