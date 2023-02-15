package com.allaboutjava.basicconcepts.misc;

class FunctionalInterfaceClass {

  void show() {
    System.out.println("Inside show()");
  }

  public static void main(String[] args) {
    Interface1 interface1 = () -> System.out.println("Hi there");
    interface1.display();
    System.out.println(interface1.getClass()
        .getName()); //output - com.allaboutjava.basicconcepts.misc.FunctionalInterfaceClass$$Lambda$14/0x0000000800066840
    FunctionalInterfaceClass functionalInterfaceClass = new FunctionalInterfaceClass();
    functionalInterfaceClass.show();
    System.out.println(functionalInterfaceClass.getClass()
        .getName()); //output - com.allaboutjava.basicconcepts.misc.FunctionalInterfaceClass
  }

}