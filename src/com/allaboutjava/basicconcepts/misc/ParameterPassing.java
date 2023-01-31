package com.allaboutjava.basicconcepts.misc;

public class ParameterPassing {

  static class Test {

    int x;

    void referenceDataTypePassing(Test test) {
      x++;
      System.out.println("Printing test.x value from inside the method - " + x);
    }

  }

  void primtiveDatatypePassing(int a, int b) {
    a++;
    b++;
    System.out.println("Printing a & b value from inside the method " + a + " - " + b);
  }


  public static void main(String[] args) {
    ParameterPassing parameterPassing = new ParameterPassing();
    int a = 10;
    int b = 20;
    System.out.println(
        "Printing a & b value from inside main BEFORE calling method " + a + " - " + b);
    parameterPassing.primtiveDatatypePassing(a, b);
    System.out.println(
        "Printing a & b value from inside main AFTER calling method " + a + " - " + b);

    Test test = new Test();
    test.x=10;
    System.out.println("Printing test.x value from inside the main BEFORE calling method - " + test.x);
    test.referenceDataTypePassing(test);
    System.out.println("Printing test.x value from inside the main AFTER calling method - " + test.x);

  }
}
