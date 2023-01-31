package com.allaboutjava.basicconcepts.misc;

public class Variables {

  int x; // Instance variable : no initialization required
  static int z; //Static variable : no initialization required

  public static void main(String[] args) {
    Variables variables = new Variables();
    System.out.println(variables.x);

    int y = 1; //Intant variable : without initialization it will give compile error.
    System.out.println(y);

    System.out.println(z);

  }


}
