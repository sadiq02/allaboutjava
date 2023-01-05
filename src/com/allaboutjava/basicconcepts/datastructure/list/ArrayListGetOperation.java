package com.allaboutjava.basicconcepts.datastructure.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGetOperation {

  public static void main(String[] args) {
    ArrayList<String> inputList = new ArrayList<>();
    inputList.add("Rahul");
    inputList.add("Sham");
    inputList.add(1, "Prateek");
    System.out.println("Original array list");
    System.out.println(inputList);
    System.out.println("Reversing the array list");
    Collections.reverse(inputList);
    System.out.println(inputList);

  }
}
