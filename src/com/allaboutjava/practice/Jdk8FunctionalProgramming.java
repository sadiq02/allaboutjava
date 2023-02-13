package com.allaboutjava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Jdk8FunctionalProgramming {

  public static void main(String[] args) {
    int a[] = new int[]{33, 11, 77, 44, 22};
    //converting primitive data type to reference type
    List<Integer> input = IntStream.of(a).boxed().collect(Collectors.toList());
    //filtering even numbers
    input.stream().filter(x -> {
      if (x % 2 == 0) {
        return false;
      }
      return true;
    }).forEach(System.out::println);

    String[] s = new String[]{"Sadiq", "Sarine", "Danish", "Amara"};
    //converting primitive type string to reference type
    List<String> inputStringList = Arrays.asList(s);
    //filtering strings that does not start with 'S'
    inputStringList.stream().filter(x -> x.startsWith("S")).forEach(System.out::println);

    List<String> list2 = Arrays.asList(s);
    //converting string list to string length list
    list2.stream().map(x -> x.length()).forEach(System.out::println);


  }
}
