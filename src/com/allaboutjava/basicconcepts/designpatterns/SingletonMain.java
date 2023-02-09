package com.allaboutjava.basicconcepts.designpatterns;

public class SingletonMain {

  SingletonMain(){

  }

  public static void main(String[] args) {
    SingletonPattern obj1 = SingletonPattern.getInstance();
    SingletonPattern obj2 = SingletonPattern.getInstance();
    SingletonPattern obj3 = SingletonPattern.getInstance();

    System.out.println("obj1 hashcode - " + obj1.hashCode());
    System.out.println("obj2 hashcode - " + obj2.hashCode());
    System.out.println("obj3 hashcode - " + obj3.hashCode());

    SingletonMain singletonMain1 = new SingletonMain();
    SingletonMain singletonMain2 = new SingletonMain();

    System.out.println("Non-singleton obj1 hashcode - "+singletonMain1.hashCode());
    System.out.println("Non-singleton obj2 hashcode - "+singletonMain2.hashCode());
  }
}
