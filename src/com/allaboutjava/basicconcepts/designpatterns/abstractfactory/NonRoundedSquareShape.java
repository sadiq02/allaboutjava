package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

public class NonRoundedSquareShape implements Shape{

  @Override
  public void draw() {
    System.out.println("NonRoundedSquareShape");
  }
}
