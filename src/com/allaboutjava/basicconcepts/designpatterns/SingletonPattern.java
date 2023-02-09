package com.allaboutjava.basicconcepts.designpatterns;

public class SingletonPattern {

  private static SingletonPattern singleton = null;
  private static SingletonPattern singleton_with_param = null;
  int a;
  int b;

  private SingletonPattern() {
  }

  private SingletonPattern(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public static SingletonPattern getInstance() {
    if (singleton == null) {
      singleton = new SingletonPattern();
      return singleton;
    } else {
      return singleton;
    }
  }

  public static SingletonPattern getInstance(int a, int b) {
    if (singleton_with_param == null) {
      singleton_with_param = new SingletonPattern(a, b);
      return singleton_with_param;
    } else {
      return singleton_with_param;
    }
  }

}
