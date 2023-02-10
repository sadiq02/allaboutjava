package com.allaboutjava.basicconcepts.designpatterns.abstractfactory;

public class RoundedCircleShape implements Shape{

  @Override
  public void draw() {
    System.out.println("RoundedCircleShape");
  }
}
