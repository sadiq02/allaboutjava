package com.allaboutjava.basicconcepts.designpatterns;

public class SingletonChild extends ProtectedSingleton {

  private static SingletonChild singleton = null;

  private SingletonChild() {
    System.out.println("Inside child constructor");
  }

  public static SingletonChild getInstance(){
    System.out.println("Inside Child getInstance() method");
    if (singleton == null) {
      singleton = new SingletonChild();
      return singleton;
    } else {
      return singleton;
    }

  }

}
