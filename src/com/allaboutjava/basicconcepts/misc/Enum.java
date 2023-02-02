package com.allaboutjava.basicconcepts.misc;

public class Enum {

  public enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSADY, FRIDAY, SATURDAY}

  public static void main(String[] args) {
    for(java.lang.Enum temp: days.values()){
      System.out.println(temp);
    }
  }
}
