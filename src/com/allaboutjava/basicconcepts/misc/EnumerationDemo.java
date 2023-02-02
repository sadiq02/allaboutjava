package com.allaboutjava.basicconcepts.misc;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationDemo {

  public static void main(String[] args) {
    Hashtable<String, Integer> hashtable = new Hashtable();
    hashtable.put("Sadiq", 33);
    hashtable.put("Sarine", 33);
    hashtable.put("Danish", 2);
    Enumeration<Integer> enumeration = hashtable.elements();
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }

}
