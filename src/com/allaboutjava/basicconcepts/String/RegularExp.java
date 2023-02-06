package com.allaboutjava.basicconcepts.String;

import java.util.regex.Pattern;

public class RegularExp {

  public static void main(String[] args) {
    System.out.println(Pattern.matches("[s.]*", "s.ssssss...."));
    System.out.println(Pattern.matches("[s.]", "s"));
    System.out.println(Pattern.matches("[a-zA-Z0-9&&[^ghj]]*", "qoieuqoiwuyuiwyer239874293874293"));
    System.out.println(Pattern.matches("[s]{5}[a-zA-Z0-9]*", "sssssrertetertert"));

    System.out.println(Pattern.matches("\\d*", "434"));
    System.out.println(Pattern.matches("\\D*", "asdiq9"));

    String str = "This is sample\nHello";
    System.out.println(str.split("\\n")[1]);
  }
}
