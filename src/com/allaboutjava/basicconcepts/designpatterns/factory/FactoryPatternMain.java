package com.allaboutjava.basicconcepts.designpatterns.factory;

public class FactoryPatternMain {

  public static void main(String[] args) {
    Shape shape = new ShapeFactory().getShape("square");
    Shape shape1 = new ShapeFactory().getShape("rectangle");
  }


}
