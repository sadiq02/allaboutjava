package com.allaboutjava.basicconcepts.misc;

import java.util.stream.Collectors;

public class StringInJdk11 {

  public static void main(String[] args) {
    String s = "Sadiq Hussain";
    System.out.println(s.repeat(4));
    System.out.println(s.strip());

    String s1 = "Sadiq\nSarine\nDanish\nAmara";
    System.out.println(s1.lines().count());
  }

}
