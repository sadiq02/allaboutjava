package com.allaboutjava.basicconcepts.designpatterns;

public class SingletonMain {

  SingletonMain() {

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

    System.out.println("Non-singleton obj1 hashcode - " + singletonMain1.hashCode());
    System.out.println("Non-singleton obj2 hashcode - " + singletonMain2.hashCode());

    SingletonPattern obj4 = SingletonPattern.getInstance(10, 20);
    SingletonPattern obj5 = SingletonPattern.getInstance(30,
        40); //this will not work because the singleton obj with parameters is already created in above step and the same will be returned when another attempt to create new obj is performed.

    System.out.println("obj4 hashcode - " + obj4.hashCode());
    System.out.println(obj4.getA());
    System.out.println("obj5 hashcode - " + obj5.hashCode());
    System.out.println(obj5.getA()); //this will return same out as obj4.getA()

    SingletonChild singletonChild1 = SingletonChild.getInstance();
    SingletonChild singletonChild2 = SingletonChild.getInstance();
    System.out.println("singletonChild1 hashcode - " + singletonChild1.hashCode());
    System.out.println("singletonChild2 hashcode - " + singletonChild2.hashCode());
  }
}
