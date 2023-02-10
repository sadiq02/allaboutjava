package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

public class FactoryProducer {


  static AbstractShapeFactory getCorrectShapeFactory(boolean rounded) {
    if (rounded) {
      return new RoundedShapeFactory();
    }
    if (!rounded) {
      return new NonRoundedShapeFactory();
    }
    return null;
  }

}
