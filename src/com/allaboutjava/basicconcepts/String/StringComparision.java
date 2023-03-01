package com.allaboutjava.basicconcepts.String;

public class StringComparision {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = s1.concat("def");
    String s3 = "abcdef";
    String s4 = "abcdef";
    String s5 = s1.concat("def")
        .intern(); //so when you do intern only then the duplicates will be removed from the memory

    System.out.println(s1);
    System.out.println(s2);
    System.out.println("s2 == s3 ? " + (s2 == s3)); //false
    System.out.println("s2.equals(s3) ? " + (s2.equals(s3))); //true, ofcourse!
    System.out.println("s3 == s4 ? " + (s3 == s4)); //true, ofcourse!
    System.out.println("s4 == s5 ? " + (s4 == s5)); //true, since intern is used

    String str1 = new String("sadiq").intern();
    String str2 = new String("sadiq").intern();
    System.out.println(str1 == str2);
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
  }
}
