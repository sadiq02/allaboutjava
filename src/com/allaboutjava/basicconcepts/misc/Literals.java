package com.allaboutjava.basicconcepts.misc;

public class Literals {

  public static void main(String[] args) {
    int x = 10; //decimal literal
    int y = 0Xfffffff; //hexadecimal literal. It starts with 0X always.
    int z = 0767; //octal literal. Cannot be > 8
    System.out.println(
        "Decimal Literal for value 10 is " + x + "\nHexadecimal Literal for value 0Xfffffff is " + y
            + "\nOctal literal for value for 0767 is " + z);
  }
}
