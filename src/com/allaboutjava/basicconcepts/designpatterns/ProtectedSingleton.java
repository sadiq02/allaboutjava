package com.allaboutjava.basicconcepts.designpatterns;

public class ProtectedSingleton {

  private static ProtectedSingleton singleton = null;
  private static ProtectedSingleton singleton_with_param = null;
  int a;
  int b;

  protected ProtectedSingleton() {
    System.out.println("Inside Parent constructor");
  }

  protected ProtectedSingleton(int a, int b) {
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

  public static ProtectedSingleton getInstance() {
    System.out.println("Inside Parent getInstance() method");
    if (singleton == null) {
      singleton = new ProtectedSingleton();
      return singleton;
    } else {
      return singleton;
    }
  }

  public static ProtectedSingleton getInstance(int a, int b) {
    if (singleton_with_param == null) {
      singleton_with_param = new ProtectedSingleton(a, b);
      return singleton_with_param;
    } else {
      return singleton_with_param;
    }
  }

}
