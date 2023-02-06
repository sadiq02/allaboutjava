package com.allaboutjava.basicconcepts.designpatterns;

public class BuilderPattern {


  public static void main(String[] args) {
    Mobile mobile = Mobile.builder().model("14").os("ios").display("oled").ram(4).build();
    System.out.println(mobile.toString());

  }

}
